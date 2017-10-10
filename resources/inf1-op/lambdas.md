---
title: Lambda Functions
layout: page
---

So say you have a list of colours: `{"blue", "red", "purple"}`

You create an ArrayList for these colours like this:

```
ArrayList<String> colours = new ArrayList<>(Arrays.asList("blue", "red", "purple"));
```

If you do `Collections.sort(colours)`, the `colours` array will now be sorted alphabetically. Like this:

```
{"blue", "purple", "red"}
```

But say you wanted to sort it by how long the colour is. In other words, the length of the string. By `colour.length()`.

How do you do that? Well, you use a comparator! `Collections.sort` takes another argument, which defines how you compare two objects.

-----

Before we go into actually defining the lambda function, we'll explain how sorting works a little bit.

The sorting algorithm needs to compare two items in a list to determine which item should come before/after another item.
It does this comparison many times to sort the entire list.

So, it needs to know to compare two items, and we can define that way by using a lambda function.

We use `1` or `-1` to denote which item is bigger/smaller than the other.

-----

To sort by string length, and not alphabetically, we do this:

```
Collections.sort(colors,
    (a, b) -> (a.length() > b.length()) ? 1 : -1
);
```

This means that if `a.length() > b.length()`, the comparator returns `1`, otherwise it returns `-1`.

The operator there with `?` and `:` is called a ternary operator. `(a, b)` are the arguments to the lambda function.
