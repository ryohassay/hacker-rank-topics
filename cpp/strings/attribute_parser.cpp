#include <cmath>
#include <cstdio>
#include <vector>
#include <iostream>
#include <algorithm>
#include <unordered_map>
#include <sstream>
using namespace std;


struct tag {
    string name;
    unordered_map<string, string> attrs;
    tag* parentTag;
    vector<tag> childTags;
    bool isOpen;
};

string replace(string str, string strToReplace, string strToReplaceWith){
    auto pos = str.find(strToReplace);
    auto len = strToReplace.length();
    if (pos != string::npos){
        str.replace(pos, len, strToReplaceWith);
    }
    return str;
}

vector<string> split(string str, char delim){
    string substr;
    stringstream ss(str);
    vector<string> substrs;
    while (getline(ss, substr, delim)){
        substrs.emplace_back(substr);
    }
    return substrs;
}

int main() {
    /* Enter your code here. Read input from STDIN. Print output to STDOUT */
    tag topTag;
    topTag.parentTag = NULL;
    int n, q;
    cin >> n >> q;
    cin.ignore();

    tag* currTag = &topTag;
    int i = 0;
    for (int j = 0; j < n; j++){
        string line;
        getline(cin, line);

        int endTagPos = 1;
        if (line[endTagPos] == '/'){
            currTag = currTag->parentTag;
        }
        else {
            int lineLen = line.size();
            line = line.substr(1, lineLen - 2);  // Removes "<" and ">" at the beginning and the end of the line
            line = replace(line, " = ", "=");
            vector<string> words = split(line, ' ');

            tag childTag;
            childTag.name = words[0];
            currTag->childTags.emplace_back(childTag);

            int size = words.size();
            for (int k = 1; k < size; k++){
                vector<string> attr = split(words[k], '=');
                attr[1] = replace(attr[1], "\"", "");
                currTag->childTags.back().attrs[attr[0]] = attr[1];  // Might need to fix
            }
            currTag = &(currTag->childTags.back());
        }
    }
    return 0;
}
