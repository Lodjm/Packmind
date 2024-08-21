namespace Practices.SimpleConstructor
{
    public class PersonBuilder
    {
        private string? _capitalizedName;
        private Title? _title;
        private int? _ageAtCreation;

        public PersonBuilder AddName(string name)
        {
            _capitalizedName = string.Concat(name[0].ToString().ToUpper(), name.AsSpan(1));

            return this;
        }

        public PersonBuilder AddTitle(int title)
        {
            if (Enum.IsDefined(typeof(Title), title))
            {
                _title = (Title)title;
            }
            else
            {
                throw new ArgumentOutOfRangeException("Title is not known");
            }

            return this;
        }

        public PersonBuilder AddBirthdate(DateTime birthdate)
        {
            TimeSpan diff = (DateTime.Now - birthdate);
            DateTime zeroTime = new DateTime(1, 1, 1);
            _ageAtCreation = (zeroTime + diff).Year - 1;

            return this;
        }

        public Person? Build()
        {
            if (_capitalizedName == null)
                throw new ArgumentNullException("Name is mandatory");
            if (_title == null)
                throw new ArgumentNullException("Title is mandatory");
            if (_ageAtCreation == null)
                throw new ArgumentNullException("Birthdate is mandatory");

            return new Person(_capitalizedName, _ageAtCreation.Value, _title.Value);
        }
    }

    public static class Example
    {
        public static void CallBuilder()
        {
            var builder = new PersonBuilder();

            builder
                .AddTitle(1)
                .AddBirthdate(new DateTime(2021, 1, 1))
                .AddName("name");

            var person = builder.Build();
        }
    }
}
