#define _POSIX_C_SOURCE 200809L
#include<stdio.h>
#include<stdlib.h>
#include<string.h>
#include<stdbool.h>

#ifndef _COORDONNEE_H_
#define _COORDONNEE_H_

typedef enum
{
    SUD,
    EST,
    OUEST,
    NORD
} orientation;

typedef struct Latitude_
{
    int valeur;
    orientation o;
} Latitude;

typedef struct Longitude_
{
    int valeur;
    orientation o;
} Longitude;

typedef struct Coordonnee_
{
    Latitude lat;
    Longitude lon;
} Coordonnee;

typedef struct Cellule_Liste_Coord_
{
    Coordonnee coord;
    struct Cellule_Liste_Coord_ *suiv;
    struct Cellule_Liste_Coord_ *prev;
} Cellule_Liste_Coord;

typedef struct Liste_Coord_
{
    unsigned int taille;
    Cellule_Liste_Coord *sentinelle;
} Liste_Coord;


// creer une cellule de liste de coordonnee a partir d'une coordonnee
Cellule_Liste_Coord *creer_cellule_liste_coord(Coordonnee coord);

// creer une liste de coordonnee vide
Liste_Coord creer_liste_coord_vide();

// ajouter une coordonnee a la fin de la liste de coordonnee
Liste_Coord ajouter_element_liste_coord(Liste_Coord liste, Coordonnee coord);

// retourne la ieme coordonnee de la liste de coordonnee
Coordonnee ieme_coord(Liste_Coord liste , int i);


#endif