1. To start up the application, run the TextEditorGUI.java main method.
2. For the javadoc comment created for the project, see it in each class's code(test classes don't have javadoc comment), or browse on a website by clicking index.html in 2212projJavadoc folder.
3. The test case in TrieTest for suggestCorrections will fail because we cannot construct the tree in Trie.java, we have to construct the tree in the upper layer(SysDictionary.java). So the test fails because empty tree cannot provide suggestions.
4. If change words_alpha.txt and userDictionary.txt location, need to re-enter the path otherwise the system cannot find them.
5. Use sample.txt to test the spell checker. Select them through "File selector" button.
