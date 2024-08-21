namespace Practices.SimpleConstructor
{
    public record Person(string Name, int AgeAtCreation, Title Title);

    public static class PersonConstructor
    {
        public static Person ConstructPerson(string name, DateTime birthdate, int title)
        {

            var capitalizedName = string.Concat(name[0].ToString().ToUpper(), name.AsSpan(1));
            var titleenum = (Title)title;
            TimeSpan diff = (DateTime.Now - birthdate);
            DateTime zeroTime = new DateTime(1, 1, 1);
            var ageAtCreation = (zeroTime + diff).Year - 1;

            return new Person(capitalizedName, ageAtCreation, titleenum);
        }
    }
}
