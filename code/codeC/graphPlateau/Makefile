.PHONY: all clean maxclean

CC=gcc
CFLAGS= -g -Wall -std=c99
LDFLAGS=-lm
EXEC=Plateau.out
OBJ= Piece.o Coordinates.o Graph.o main.o

all:	$(OBJ)
	$(CC) $(CFLAGS) $(OBJ) -o $(EXEC) $(LDFLAGS)

Piece.o : Piece.c
Coordinates.o : Coordinates.c
Graph.o : Graph.c Graph.h
main.o: main.c Graph.h

clean:
	rm -rf *.o

maxclean: clean
	  rm -rf $(EXEC) *.o *.txt *.bi
