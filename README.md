# Better Informatics

## Guidelines for contributing

- In order to contribute you will need GitHub account.
- If you would like to make a major change, or a change to the overall visual design, [submit an issue](https://github.com/compsoc-edinburgh/betterinformatics/issues/new) with your idea proposal first.
- Most of the content right now is in the `_sections` directory, so [click here](https://github.com/compsoc-edinburgh/betterinformatics/tree/master/_sections) to view the list of sections to edit.

## Development (not for general contributions)

Build using `docker run --volume=$(pwd):/src:Z  grahamc/jekyll build --watch`

Hacky pull every second `while true; do git pull --ff-only; sleep 1; done`
