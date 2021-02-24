#!/usr/bin/env bash

# Stop on first error
set -e

echo "***********************************************************"
echo "  Your site will be available at http://localhost:4000"
echo "***********************************************************"

# Start Jekyll and watch for changes
export JEKYLL_VERSION=3.8

docker run --rm \
  --volume="$PWD:/srv/jekyll" \
  --publish 4000:4000 \
  -it jekyll/jekyll:$JEKYLL_VERSION \
  jekyll serve --watch --drafts -H 0.0.0.0
