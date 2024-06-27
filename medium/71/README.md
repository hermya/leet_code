<h2 style="color:#F90;">71. Simplify Path</h2>

Given an absolute path for a Unix-style file system, which begins with a slash `'/'`, transform this path into its **simplified canonical path**.

In Unix-style file system context, a single period `'.'` signifies the current directory, a double period `".."` denotes moving up one directory level, and multiple slashes such as `"//"` are interpreted as a single slash. In this problem, treat sequences of periods not covered by the previous rules (like `"..."`) as valid names for files or directories.

The simplified canonical path should adhere to the following rules:

-   It must start with a single slash `'/'`.
-   Directories within the path should be separated by only one slash `'/'`.
-   It should not end with a slash `'/'`, unless it's the root directory.
-   It should exclude any single or double periods used to denote current or parent directories.

Return the new path.

**EXAMPLE**
>**Input**: path = "/.../a/../b/c/../d/./"
**Output**: "/.../b/d"

<p style="color:#007;">
<b>Explanation</b><br>
"..." is a valid name for a directory in this problem.
</p>

**[leetcode url](https://leetcode.com/problems/simplify-path/description/)**
