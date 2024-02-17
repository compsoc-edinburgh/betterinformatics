import yaml

with open("./_data/settings.yml") as f:
    data = yaml.load(f, Loader=yaml.FullLoader)

data["examSeason"] = not data["examSeason"]

with open("./_data/settings.yml", "w") as f:
    yaml.dump(data, f)
