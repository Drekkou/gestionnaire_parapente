#define _POSIX_C_SOURCE 200809L
#include "coordonnee.h"

Cellule_Liste_Coord *creer_cellule_liste_coord(Coordonnee coord)
{
    Cellule_Liste_Coord *cell;
    cell = (Cellule_Liste_Coord *)malloc(sizeof(Cellule_Liste_Coord));
    if (cell == NULL)
    {
        fprintf(stderr, "creer_cellule_liste_coord : allocation impossible");
        exit(-1);
    }

    cell->coord = coord;
    cell->prev = NULL;
    cell->suiv = NULL;
    return cell;
}

Liste_Coord creer_liste_coord_vide()
{
    Cellule_Liste_Coord *sentinelle = (Cellule_Liste_Coord *)malloc(sizeof(Cellule_Liste_Coord));
    if (sentinelle == NULL)
    {
        fprintf(stderr, "creer_liste_coord_vide : allocation impossible");
        exit(-1);
    }
    memset(&sentinelle->coord, 0, sizeof(Coordonnee));
    sentinelle->prev = NULL;
    sentinelle->suiv = NULL;

    Liste_Coord liste = {0, sentinelle};
    return liste;
}

Liste_Coord ajouter_element_liste_coord(Liste_Coord liste, Coordonnee coord)
{
    Cellule_Liste_Coord *cell;

    cell = creer_cellule_liste_coord(coord);
    if (liste.taille == 0)
    {
        liste.sentinelle->prev = cell;
        liste.sentinelle->suiv = cell;
    }
    else
    {
        cell->prev = liste.sentinelle->prev;
        cell->suiv = liste.sentinelle;
        liste.sentinelle->prev->suiv = cell;
        liste.sentinelle->prev = cell;
    }
    liste.taille++;
    return liste;
}

Coordonnee ieme_coord(Liste_Coord liste, int i){
    Cellule_Liste_Coord *cell;
    cell = liste.sentinelle->suiv; 
    for(int j=0;j<i;j++){
        cell = cell->suiv;
    }
    return cell->coord;
}