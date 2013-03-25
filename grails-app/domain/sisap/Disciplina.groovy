package sisap

class Disciplina {
    static mapWith="mongo"

    String codigo
    String nome
    String descricao

    static constraints = {
        codigo(blank: false, unique: true)
        nome(blank: false, unique: true)
        descricao(maxSize: 500)
    }
    String toString(){
        return nome
    }
}


