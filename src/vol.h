#define _POSIX_C_SOURCE 200809L
#include<stdio.h>
#include<stdlib.h>
#include<string.h>
#include<stdbool.h>

#include"coordonnee.h"

#ifndef _VOL_H_
#define _VOL_H_

typedef struct Vol_
{
    char date;
    int heure_depart;
    int heure_fin;
    char pilote;
    char machine;
    Liste_Coord liste_coord;
}Vol;

//creer un vol vide
Vol *creer_vol_vide();

//initialise un vol 
Vol *init_vol(char date; );

//ajoute une coordonnee a la fin d'un vol
Vol *add_coord(int lat, int lon, int alt_a, int alt_b);


#endif