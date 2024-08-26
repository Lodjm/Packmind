namespace Practices.EnumFlag
{
    public enum MyBadEnum
    {
        One = 1,
        Two = 2,
        Four = 4
    }

    public interface IMultipleEnum<T>
    {
        void AddMyEnum(T myEnum);
        bool Contains(T myEnum);
    }

    public class OrderWithEnum : IMultipleEnum<MyBadEnum>
    {
        public List<MyBadEnum> Enums { get; set; } = new();

        public void AddMyEnum(MyBadEnum myBadEnum)
        {
            if (!Enums.Contains(myBadEnum))
                Enums.Add(myBadEnum);
        }

        public bool Contains(MyBadEnum myBadEnum)
        {
            return Enums.Contains(myBadEnum);
        }
    }
}
