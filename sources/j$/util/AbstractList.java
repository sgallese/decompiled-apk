package j$.util;

import j$.util.Spliterator;
import java.util.AbstractCollection;
import java.util.ConcurrentModificationException;
import java.util.function.Consumer;

/* loaded from: classes2.dex */
public abstract class AbstractList extends AbstractCollection implements java.util.List {

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes2.dex */
    public static final class RandomAccessSpliterator implements Spliterator {
        private int expectedModCount;
        private int fence;
        private int index;
        private final java.util.List list;

        private RandomAccessSpliterator(RandomAccessSpliterator randomAccessSpliterator, int i10, int i11) {
            this.list = randomAccessSpliterator.list;
            this.index = i10;
            this.fence = i11;
            this.expectedModCount = randomAccessSpliterator.expectedModCount;
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        public RandomAccessSpliterator(java.util.List list) {
            this.list = list;
            this.index = 0;
            this.fence = -1;
            this.expectedModCount = 0;
        }

        static void checkAbstractListModCount(AbstractList abstractList, int i10) {
        }

        private static Object get(java.util.List list, int i10) {
            try {
                return list.get(i10);
            } catch (IndexOutOfBoundsException unused) {
                throw new ConcurrentModificationException();
            }
        }

        private int getFence() {
            java.util.List list = this.list;
            int i10 = this.fence;
            if (i10 < 0) {
                int size = list.size();
                this.fence = size;
                return size;
            }
            return i10;
        }

        @Override // j$.util.Spliterator
        public int characteristics() {
            return 16464;
        }

        @Override // j$.util.Spliterator
        public long estimateSize() {
            return getFence() - this.index;
        }

        @Override // j$.util.Spliterator
        public void forEachRemaining(Consumer consumer) {
            Objects.requireNonNull(consumer);
            java.util.List list = this.list;
            int fence = getFence();
            this.index = fence;
            for (int i10 = this.index; i10 < fence; i10++) {
                consumer.accept(get(list, i10));
            }
            checkAbstractListModCount(null, this.expectedModCount);
        }

        @Override // j$.util.Spliterator
        public /* synthetic */ java.util.Comparator getComparator() {
            return Spliterator.CC.$default$getComparator(this);
        }

        @Override // j$.util.Spliterator
        public /* synthetic */ long getExactSizeIfKnown() {
            return Spliterator.CC.$default$getExactSizeIfKnown(this);
        }

        @Override // j$.util.Spliterator
        public /* synthetic */ boolean hasCharacteristics(int i10) {
            return Spliterator.CC.$default$hasCharacteristics(this, i10);
        }

        @Override // j$.util.Spliterator
        public boolean tryAdvance(Consumer consumer) {
            consumer.getClass();
            int fence = getFence();
            int i10 = this.index;
            if (i10 < fence) {
                this.index = i10 + 1;
                consumer.accept(get(this.list, i10));
                checkAbstractListModCount(null, this.expectedModCount);
                return true;
            }
            return false;
        }

        @Override // j$.util.Spliterator
        public Spliterator trySplit() {
            int fence = getFence();
            int i10 = this.index;
            int i11 = (fence + i10) >>> 1;
            if (i10 >= i11) {
                return null;
            }
            this.index = i11;
            return new RandomAccessSpliterator(this, i10, i11);
        }
    }
}
