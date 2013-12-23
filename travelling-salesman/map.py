#!/usr/bin/env python

import sys
from math import sqrt, pow

def distance(x1, y1, x2, y2):
    return sqrt(pow((x1 - x2),2.0) + pow((y1 - y2),2.0))

# input comes from standard input
for line in sys.stdin:
    line = line.strip()
    name1, x1, y1, name2, x2, y2 = line.split(',', 5)

    try:
        x1 = float(x1)
        x2 = float(x2)
        y1 = float(y1)
        y2 = float(y2)
    except:
        continue

    print "%f,%s,%s" % (distance(x1, y1, x2, y2), name1, name2)
    
        
