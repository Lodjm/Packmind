using System.Collections;

namespace Practices
{
    public class OrderCollection : ICollection<Order>
    {
        public int Count => throw new NotImplementedException();

        public bool IsReadOnly => throw new NotImplementedException();

        public void Add(Order item)
        {
            throw new NotImplementedException();
        }

        public void Clear()
        {
            throw new NotImplementedException();
        }

        public bool Contains(Order item)
        {
            throw new NotImplementedException();
        }

        public void CopyTo(Order[] array, int arrayIndex)
        {
            throw new NotImplementedException();
        }

        public IEnumerator<Order> GetEnumerator()
        {
            throw new NotImplementedException();
        }

        public bool Remove(Order item)
        {
            throw new NotImplementedException();
        }

        IEnumerator IEnumerable.GetEnumerator()
        {
            throw new NotImplementedException();
        }
    }
}
