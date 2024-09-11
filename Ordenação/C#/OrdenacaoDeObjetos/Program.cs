using OrdenacaoDeObjetos;

//Aluno a1 = new Aluno("Alex", 50);
//Aluno a2 = new Aluno("Romeo", 19);

//Console.WriteLine(a2.CompareTo(a1));

List<Aluno> lista = new List<Aluno>();

lista.Add(new Aluno("Alex", 50));
lista.Add(new Aluno("Matheus", 20));
lista.Add(new Aluno("Iago", 21));
lista.Add(new Aluno("Bruno", 22));
lista.Add(new Aluno("Bruno", 19));
lista.Add(new Aluno("Romeo", 19));

//lista.Sort();
//lista = lista.OrderBy(a => a.Nome).ThenBy(a => a.Idade).ToList();

Ordenacao.pente(lista);

foreach(var item in lista)
{
    Console.WriteLine(item);
}