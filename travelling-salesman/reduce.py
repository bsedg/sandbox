#!/usr/bin/env python

import sys
from collections import OrderedDict

result = OrderedDict()
visited_to = []
visited_from = []

for line in sys.stdin:
    line = line.strip()

    distance, point1, point2 = line.split(',', 2)
    
    point1 = point1.strip()
    point2 = point2.strip()

    key = '-'.join([point1, point2])

    if (point1 not in visited_from) or (point2 not in visited_to):
        result[key] = float(distance)
        visited_to.append(point2)
        visited_from.append(point1)

for r in result.keys():
    print "%s, %f" % (r, result[r])
