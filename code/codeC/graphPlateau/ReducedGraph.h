//
//  Graph.h
//  graphes
//
//  Created by Mmadi.anzilane on 14/04/2017.
//  Copyright © 2017 Mmadi.anzilane. All rights reserved.
//
#include "HashTable.h"
/*-----------------------------------------------------------------------------*/
/*-----------------------------------------------------------------------------*/
                            //implement TAD ReducedGraph
/*-----------------------------------------------------------------------------*/
typedef struct s_ReducedGraph {
    TabHash * whiteHashTab;
    TabHash * blackHashTab;
    Graph rG;
} ReducedGraph;

ReducedGraph * createReducedGraph();

/*-----------------------------------------------------------------------------*/
