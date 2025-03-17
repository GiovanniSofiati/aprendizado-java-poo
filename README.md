É uma técnica que oculta os detalhes internos de uma classe, permitindo que apenas o necessário seja exposto para o resto do sistema.

---

**🔏 Private:**

- Permite o acesso a atributos apenas dentro da classe.
- Protege os atributos de modificações externas.
- Por boas praticas, sempre deixaremos os atributos (variáveis) privados.

**Para visualizar características privadas em outras instancias: Get**

Utilizamos método assessor Get (apenas para visualização)

OBS: Temos que usar o getter dentro da classe que temos a instancia privada.

**Para modificar ou atribuir valores as nossas instancias privadas: Set**

Utilizamos o método assessor Set (Para dar valor)

OBS: Usamos o setter dentro da classe que temos a instância privada

**📢 Public:**

- Permite o acesso a atributos e métodos fora da classe
- Os métodos públicos (getters e setters) controlam o acesso aos atributos.

### 👨🏼‍🦳 Herança:

A herança permite que uma classe seja baseada em outra classe existente, conhecida como superclasse (Classe Pai). A classe que herda os atributos e métodos da classe base é chamada de subclasse (Classe Filha).
