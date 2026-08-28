#define _POSIX_C_SOURCE 200809L
#include "vol.h"


#ifndef _IMPORTATIONGPS_H_
#define _IMPORTATIONGPS_H_

/* -1 si erreur 0 sinon*/
int entete_fichier(FILE *f);


/* prend nom du fichier de vol en paramètre et retourne la liste des coord/alt sous le type vol*/
Vol *lire_fichier(char *Nom_fichier);

#endif