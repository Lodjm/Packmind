namespace Practices.EnumFlag
{
    [Flags]
    public enum MyGoodEnum
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

    public class OrderWithEnum : IMultipleEnum<MyGoodEnum>
    {
        private MyGoodEnum _myEnum = new();

        public void AddMyEnum(MyGoodEnum myEnum)
        {
            _myEnum |= myEnum;
        }

        public bool Contains(MyGoodEnum myEnum)
        {
            return _myEnum.HasFlag(myEnum);
        }
    }
}
