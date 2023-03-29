package mx.ipn.escom.compiladores;

public enum TipoToken {
    // Crear un tipoToken por palabra reservada
    // Crear un tipoToken: identificador, una cadena y numero
    // Crear un tipoToken por cada "Signo del lenguaje" (ver clase Scanner)


    // Palabras clave:
    Y,
    CLASE,
    ADEMAS,
    FALSO,
    PARA,
    FUN,
    SI,
    NULO,
    O,
    IMPRIMIR,
    RETORNAR,
    SUPER,
    ESTE,
    VERDADERO,
    VARIABLE,
    MIENTRAS,
    PAR_ABRE,
    PAR_CIERRA,
    COR_ABRE,
    COR_CIERRA,
    COMA,
    PUNTO,
    PUNTO_COMA,
    GUION,
    MAS,
    ASTERISCO,
    DIAGONAL,
    SIGNO_ADMI, // ! y !=
    IGUAL, // = y ==
    MENOR,
    MENOR_IGUAL,
    MAYOR,
    MAYOR_IGUAL,

    // Final de cadena
    EOF
}
