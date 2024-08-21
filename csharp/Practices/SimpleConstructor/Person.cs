namespace Practices.SimpleConstructor
{
    public class Person
    {
        public Title Title { get; private set; }
        public string Name { get; private set; }
        public int AgeAtCreation { get; private set; }

        public Person(string name, DateTime birthdate, int title)
        {
            Name = string.Concat(name[0].ToString().ToUpper(), name.AsSpan(1));
            Title = (Title)title;
            TimeSpan diff = (DateTime.Now - birthdate);
            DateTime zeroTime = new DateTime(1, 1, 1);
            AgeAtCreation = (zeroTime + diff).Year - 1;
        }
    }
}
