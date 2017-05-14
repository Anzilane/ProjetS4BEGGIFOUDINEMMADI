//
//  main.c
//  graphes
//
//  Created by Mmadi.anzilane on 14/04/2017.
//  Copyright © 2017 Mmadi.anzilane. All rights reserved.
//

#include <stdio.h>
#include "Graph.h"

int main(int argc, const char * argv[]) {

    // int dim(char*fich);
    // char colors[36] = {0};
    // for (size_t i = 0; i < 6*6; i++) {
    //     colors[i] = '*';
    // }
    //char * colors = transformGraphToBoardOfChar("../../../SaveFiles/auvgarde1.txt");
    //printf("colors  %s\n", colors);
    char *spots = "11#o..................o.....................................*..*...........................o................................0" ;//"3..*oo*...4102101211";
    int BTabGame[] = {4, 5, 2, 5, 5};
    int WTabGame[] = {6, 1, 8, 8, 0, 0, 0};
    saveBoardFile("../../../SaveFiles/auvgarde1.txt", spots, BTabGame, WTabGame);
    //Graph g = CreateGraph(12);
    //replaceVertexGraph(g);
    //g = CreateBoardGraph(g, colors);
    //postUpBoard(g);
    //postUpSideAdjacentGraph(g);
    //destroyGraph(g);
    // char *Wplayer = "anzilane#14/02/1997@anzilane@mail.fr#1";
    // char *Bplayer = "angelo#14/06/1888@angelodelagx@gmail.com#0";
    // savePlayer("../../../SaveFiles/player.txt", Bplayer, Wplayer);
    // char * player = loarPlayer('o', "../../../SaveFiles/player.txt");
    // printf("BLACK Player %s\n", player);
    return 0;
}
