# travelling-salesman

An implementation of the travelling salesman problem using the Map-Reduce pattern in Python.

## Run

```
cat input.csv | python preprocess.py | python map.py | sort | python reduce.py
```

## Design

### Input Data

A list of cities, or points, is in a CSV file, which gets piped into the pre-processor using standard input.

For example, the provided input in input.csv is formatted like the following:
```
a, 1, 1
b, 1, 3
c, 2, 2
d, 3, 0
```

### Pre-Process Data

Pre-processing the data simply finds all connecting nodes, which this example assumes all nodes can be connected and it generates node edges between each node.  

This step may be skipped if the input data already contains the 

#### Sample Output Data

```
a, 1, 1, b, 1, 3
a, 1, 1, c, 2, 2
a, 1, 1, d, 3, 0
```

### Map

The map step calculates the euclidean distance between the two points and outputs 

```
2.236068,a, b
4.123106,a, c
3.000000,a, d
```

### Reduce

The reduce step receives input from from standard input sorted by distance and builds up a solution of shortest paths.
