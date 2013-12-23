#!/usr/bin/env python

import sys
import itertools

cities = []

# input comes from standard input
for line in sys.stdin:
    line = line.strip()
    cities.append(line)

perms = itertools.permutations(cities, 2)
for perm in perms:
    print perm[0],',',perm[1]
