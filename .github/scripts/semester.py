import yaml

with open("./_data/settings.yml") as f:
    data = yaml.load(f, Loader=yaml.FullLoader)

if data["semester"] == 1:
    data["semester"] = 2
elif data["semester"] == 2:
    data["semester"] = 1

with open("./_data/settings.yml", "w") as f:
    yaml.dump(data, f)