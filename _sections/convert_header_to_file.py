import os, sys, re

f = open(sys.argv[1], "r")
contents = f.read()


def filer(title, content):
	return "---\nyear: 5\ntitle: {}\n---\n\n{}\n".format(title, content)

matches = re.findall(r"\n\*\*(.*?)\*\*\n\n((?:.|\n)*?)(?=\*\*)", contents)
for row in matches:
	title = row[0]
	fname = title.split(" ")[0].lower() + ".md"

	f = open(fname, "w")
	f.write(filer(title, row[1].strip()))

# for line in contents.split("\n"):
# 	line = line.strip()
# 	beginning = line[:2]
# 	ending = line[-2:]
# 	if (beginning == "**") and (ending == "**"):
# 		title = line[2:-2]
# 		fname = title.split(" ")[0].lower() + ".md"
		
# 		f = open(fname, "w")
# 		f.write(filer(title))