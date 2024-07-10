# usage: $> generate_template.py problem-level problem-number
# problem-level : easy medium hard | .
# problem-number : <problem number on leetcode>

import sys
import os
pl = sys.argv[1]
pn = sys.argv[2]

cwd = '"' + os.getcwd()

if (pl != '.'):
    if (not os.path.exists(cwd + "\\" +pl + "\"")):
        os.system("mkdir " + cwd + "\\" +pl + "\"")
    pl += "\\"
else:
    pl = ''

os.system("mkdir " + cwd + "\\" + pl + str(pn) + "\"") # make directory with problem number
sol_path = cwd + "\\" +pl + str(pn) +"\\"
os.system("cd. > " + sol_path + "Solution.java\" ") # create files for specific problem number
os.system("cd. > " + sol_path + "README.md\"") # create files for specific problem number
