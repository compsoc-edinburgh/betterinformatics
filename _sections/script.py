import glob, os
dir_path = os.path.dirname(os.path.realpath(__file__))
os.chdir(dir_path)
for file in glob.glob("*.md"):
    print(file)
    output = "---\nyear: inf3\ntitle: {}\n---\n\n\n".format(file.upper()[:-3])
    print(output)

    with open(file,'w') as f:
        f.write(output)