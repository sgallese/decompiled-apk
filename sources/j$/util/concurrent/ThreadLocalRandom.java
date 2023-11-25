package j$.util.concurrent;

import j$.util.Spliterator;
import j$.util.stream.DoubleStream;
import j$.util.stream.IntStream;
import j$.util.stream.LongStream;
import j$.util.stream.StreamSupport;
import java.io.ObjectOutputStream;
import java.io.ObjectStreamField;
import java.security.AccessController;
import java.security.PrivilegedAction;
import java.security.SecureRandom;
import java.util.Comparator;
import java.util.Random;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicLong;
import java.util.function.Consumer;
import java.util.function.DoubleConsumer;
import java.util.function.IntConsumer;
import java.util.function.LongConsumer;

/* loaded from: classes2.dex */
public class ThreadLocalRandom extends Random {
    private static final long serialVersionUID = -5851777807851030925L;
    boolean initialized;
    int threadLocalRandomProbe;
    long threadLocalRandomSeed;
    private static final ObjectStreamField[] serialPersistentFields = {new ObjectStreamField("rnd", Long.TYPE), new ObjectStreamField("initialized", Boolean.TYPE)};
    private static final ThreadLocal nextLocalGaussian = new ThreadLocal();
    private static final AtomicInteger probeGenerator = new AtomicInteger();
    private static final ThreadLocal instances = new ThreadLocal() { // from class: j$.util.concurrent.ThreadLocalRandom.1
        /* JADX INFO: Access modifiers changed from: protected */
        @Override // java.lang.ThreadLocal
        public ThreadLocalRandom initialValue() {
            return new ThreadLocalRandom();
        }
    };
    private static final AtomicLong seeder = new AtomicLong(mix64(System.currentTimeMillis()) ^ mix64(System.nanoTime()));

    /* JADX INFO: Access modifiers changed from: private */
    /* loaded from: classes2.dex */
    public static final class RandomDoublesSpliterator implements Spliterator.OfDouble {
        final double bound;
        final long fence;
        long index;
        final double origin;

        RandomDoublesSpliterator(long j10, long j11, double d10, double d11) {
            this.index = j10;
            this.fence = j11;
            this.origin = d10;
            this.bound = d11;
        }

        @Override // j$.util.Spliterator
        public int characteristics() {
            return 17728;
        }

        @Override // j$.util.Spliterator
        public long estimateSize() {
            return this.fence - this.index;
        }

        @Override // j$.util.Spliterator.OfDouble, j$.util.Spliterator
        public /* synthetic */ void forEachRemaining(Consumer consumer) {
            Spliterator.OfDouble.CC.$default$forEachRemaining(this, consumer);
        }

        @Override // j$.util.Spliterator.OfPrimitive
        public void forEachRemaining(DoubleConsumer doubleConsumer) {
            doubleConsumer.getClass();
            long j10 = this.index;
            long j11 = this.fence;
            if (j10 < j11) {
                this.index = j11;
                double d10 = this.origin;
                double d11 = this.bound;
                ThreadLocalRandom current = ThreadLocalRandom.current();
                do {
                    doubleConsumer.accept(current.internalNextDouble(d10, d11));
                    j10++;
                } while (j10 < j11);
            }
        }

        @Override // j$.util.Spliterator
        public /* synthetic */ Comparator getComparator() {
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

        @Override // j$.util.Spliterator.OfDouble, j$.util.Spliterator
        public /* synthetic */ boolean tryAdvance(Consumer consumer) {
            return Spliterator.OfDouble.CC.$default$tryAdvance(this, consumer);
        }

        @Override // j$.util.Spliterator.OfPrimitive
        public boolean tryAdvance(DoubleConsumer doubleConsumer) {
            doubleConsumer.getClass();
            long j10 = this.index;
            if (j10 < this.fence) {
                doubleConsumer.accept(ThreadLocalRandom.current().internalNextDouble(this.origin, this.bound));
                this.index = j10 + 1;
                return true;
            }
            return false;
        }

        @Override // j$.util.Spliterator
        public RandomDoublesSpliterator trySplit() {
            long j10 = this.index;
            long j11 = (this.fence + j10) >>> 1;
            if (j11 <= j10) {
                return null;
            }
            this.index = j11;
            return new RandomDoublesSpliterator(j10, j11, this.origin, this.bound);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* loaded from: classes2.dex */
    public static final class RandomIntsSpliterator implements Spliterator.OfInt {
        final int bound;
        final long fence;
        long index;
        final int origin;

        RandomIntsSpliterator(long j10, long j11, int i10, int i11) {
            this.index = j10;
            this.fence = j11;
            this.origin = i10;
            this.bound = i11;
        }

        @Override // j$.util.Spliterator
        public int characteristics() {
            return 17728;
        }

        @Override // j$.util.Spliterator
        public long estimateSize() {
            return this.fence - this.index;
        }

        @Override // j$.util.Spliterator.OfInt, j$.util.Spliterator
        public /* synthetic */ void forEachRemaining(Consumer consumer) {
            Spliterator.OfInt.CC.$default$forEachRemaining(this, consumer);
        }

        @Override // j$.util.Spliterator.OfPrimitive
        public void forEachRemaining(IntConsumer intConsumer) {
            intConsumer.getClass();
            long j10 = this.index;
            long j11 = this.fence;
            if (j10 < j11) {
                this.index = j11;
                int i10 = this.origin;
                int i11 = this.bound;
                ThreadLocalRandom current = ThreadLocalRandom.current();
                do {
                    intConsumer.accept(current.internalNextInt(i10, i11));
                    j10++;
                } while (j10 < j11);
            }
        }

        @Override // j$.util.Spliterator
        public /* synthetic */ Comparator getComparator() {
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

        @Override // j$.util.Spliterator.OfInt, j$.util.Spliterator
        public /* synthetic */ boolean tryAdvance(Consumer consumer) {
            return Spliterator.OfInt.CC.$default$tryAdvance(this, consumer);
        }

        @Override // j$.util.Spliterator.OfPrimitive
        public boolean tryAdvance(IntConsumer intConsumer) {
            intConsumer.getClass();
            long j10 = this.index;
            if (j10 < this.fence) {
                intConsumer.accept(ThreadLocalRandom.current().internalNextInt(this.origin, this.bound));
                this.index = j10 + 1;
                return true;
            }
            return false;
        }

        @Override // j$.util.Spliterator
        public RandomIntsSpliterator trySplit() {
            long j10 = this.index;
            long j11 = (this.fence + j10) >>> 1;
            if (j11 <= j10) {
                return null;
            }
            this.index = j11;
            return new RandomIntsSpliterator(j10, j11, this.origin, this.bound);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* loaded from: classes2.dex */
    public static final class RandomLongsSpliterator implements Spliterator.OfLong {
        final long bound;
        final long fence;
        long index;
        final long origin;

        RandomLongsSpliterator(long j10, long j11, long j12, long j13) {
            this.index = j10;
            this.fence = j11;
            this.origin = j12;
            this.bound = j13;
        }

        @Override // j$.util.Spliterator
        public int characteristics() {
            return 17728;
        }

        @Override // j$.util.Spliterator
        public long estimateSize() {
            return this.fence - this.index;
        }

        @Override // j$.util.Spliterator.OfLong, j$.util.Spliterator
        public /* synthetic */ void forEachRemaining(Consumer consumer) {
            Spliterator.OfLong.CC.$default$forEachRemaining(this, consumer);
        }

        @Override // j$.util.Spliterator.OfPrimitive
        public void forEachRemaining(LongConsumer longConsumer) {
            longConsumer.getClass();
            long j10 = this.index;
            long j11 = this.fence;
            if (j10 < j11) {
                this.index = j11;
                long j12 = this.origin;
                long j13 = this.bound;
                ThreadLocalRandom current = ThreadLocalRandom.current();
                do {
                    longConsumer.accept(current.internalNextLong(j12, j13));
                    j10++;
                } while (j10 < j11);
            }
        }

        @Override // j$.util.Spliterator
        public /* synthetic */ Comparator getComparator() {
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

        @Override // j$.util.Spliterator.OfLong, j$.util.Spliterator
        public /* synthetic */ boolean tryAdvance(Consumer consumer) {
            return Spliterator.OfLong.CC.$default$tryAdvance(this, consumer);
        }

        @Override // j$.util.Spliterator.OfPrimitive
        public boolean tryAdvance(LongConsumer longConsumer) {
            longConsumer.getClass();
            long j10 = this.index;
            if (j10 < this.fence) {
                longConsumer.accept(ThreadLocalRandom.current().internalNextLong(this.origin, this.bound));
                this.index = j10 + 1;
                return true;
            }
            return false;
        }

        @Override // j$.util.Spliterator
        public RandomLongsSpliterator trySplit() {
            long j10 = this.index;
            long j11 = (this.fence + j10) >>> 1;
            if (j11 <= j10) {
                return null;
            }
            this.index = j11;
            return new RandomLongsSpliterator(j10, j11, this.origin, this.bound);
        }
    }

    static {
        if (((Boolean) AccessController.doPrivileged(new PrivilegedAction() { // from class: j$.util.concurrent.ThreadLocalRandom.2
            @Override // java.security.PrivilegedAction
            public Boolean run() {
                return Boolean.valueOf(Boolean.getBoolean("java.util.secureRandomSeed"));
            }
        })).booleanValue()) {
            byte[] seed = SecureRandom.getSeed(8);
            long j10 = seed[0] & 255;
            for (int i10 = 1; i10 < 8; i10++) {
                j10 = (j10 << 8) | (seed[i10] & 255);
            }
            seeder.set(j10);
        }
    }

    private ThreadLocalRandom() {
        this.initialized = true;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static final int advanceProbe(int i10) {
        int i11 = i10 ^ (i10 << 13);
        int i12 = i11 ^ (i11 >>> 17);
        int i13 = i12 ^ (i12 << 5);
        ((ThreadLocalRandom) instances.get()).threadLocalRandomProbe = i13;
        return i13;
    }

    public static ThreadLocalRandom current() {
        ThreadLocalRandom threadLocalRandom = (ThreadLocalRandom) instances.get();
        if (threadLocalRandom.threadLocalRandomProbe == 0) {
            localInit();
        }
        return threadLocalRandom;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static final int getProbe() {
        return ((ThreadLocalRandom) instances.get()).threadLocalRandomProbe;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static final void localInit() {
        int addAndGet = probeGenerator.addAndGet(-1640531527);
        if (addAndGet == 0) {
            addAndGet = 1;
        }
        long mix64 = mix64(seeder.getAndAdd(-4942790177534073029L));
        ThreadLocalRandom threadLocalRandom = (ThreadLocalRandom) instances.get();
        threadLocalRandom.threadLocalRandomSeed = mix64;
        threadLocalRandom.threadLocalRandomProbe = addAndGet;
    }

    private static int mix32(long j10) {
        long j11 = (j10 ^ (j10 >>> 33)) * (-49064778989728563L);
        return (int) (((j11 ^ (j11 >>> 33)) * (-4265267296055464877L)) >>> 32);
    }

    private static long mix64(long j10) {
        long j11 = (j10 ^ (j10 >>> 33)) * (-49064778989728563L);
        long j12 = (j11 ^ (j11 >>> 33)) * (-4265267296055464877L);
        return j12 ^ (j12 >>> 33);
    }

    private Object readResolve() {
        return current();
    }

    private void writeObject(ObjectOutputStream objectOutputStream) {
        ObjectOutputStream.PutField putFields = objectOutputStream.putFields();
        putFields.put("rnd", this.threadLocalRandomSeed);
        putFields.put("initialized", true);
        objectOutputStream.writeFields();
    }

    @Override // java.util.Random
    public DoubleStream doubles() {
        return StreamSupport.doubleStream(new RandomDoublesSpliterator(0L, Long.MAX_VALUE, Double.MAX_VALUE, 0.0d), false);
    }

    @Override // java.util.Random
    public DoubleStream doubles(double d10, double d11) {
        if (d10 < d11) {
            return StreamSupport.doubleStream(new RandomDoublesSpliterator(0L, Long.MAX_VALUE, d10, d11), false);
        }
        throw new IllegalArgumentException("bound must be greater than origin");
    }

    @Override // java.util.Random
    public DoubleStream doubles(long j10) {
        if (j10 >= 0) {
            return StreamSupport.doubleStream(new RandomDoublesSpliterator(0L, j10, Double.MAX_VALUE, 0.0d), false);
        }
        throw new IllegalArgumentException("size must be non-negative");
    }

    @Override // java.util.Random
    public DoubleStream doubles(long j10, double d10, double d11) {
        if (j10 >= 0) {
            if (d10 < d11) {
                return StreamSupport.doubleStream(new RandomDoublesSpliterator(0L, j10, d10, d11), false);
            }
            throw new IllegalArgumentException("bound must be greater than origin");
        }
        throw new IllegalArgumentException("size must be non-negative");
    }

    @Override // java.util.Random
    public /* synthetic */ java.util.stream.DoubleStream doubles() {
        return DoubleStream.Wrapper.convert(doubles());
    }

    @Override // java.util.Random
    public /* synthetic */ java.util.stream.DoubleStream doubles(double d10, double d11) {
        return DoubleStream.Wrapper.convert(doubles(d10, d11));
    }

    @Override // java.util.Random
    public /* synthetic */ java.util.stream.DoubleStream doubles(long j10) {
        return DoubleStream.Wrapper.convert(doubles(j10));
    }

    @Override // java.util.Random
    public /* synthetic */ java.util.stream.DoubleStream doubles(long j10, double d10, double d11) {
        return DoubleStream.Wrapper.convert(doubles(j10, d10, d11));
    }

    final double internalNextDouble(double d10, double d11) {
        double nextLong = (nextLong() >>> 11) * 1.1102230246251565E-16d;
        if (d10 < d11) {
            double d12 = (nextLong * (d11 - d10)) + d10;
            return d12 >= d11 ? Double.longBitsToDouble(Double.doubleToLongBits(d11) - 1) : d12;
        }
        return nextLong;
    }

    final int internalNextInt(int i10, int i11) {
        int i12;
        int mix32 = mix32(nextSeed());
        if (i10 < i11) {
            int i13 = i11 - i10;
            int i14 = i13 - 1;
            if ((i13 & i14) == 0) {
                i12 = mix32 & i14;
            } else if (i13 > 0) {
                int i15 = mix32 >>> 1;
                while (true) {
                    int i16 = i15 + i14;
                    i12 = i15 % i13;
                    if (i16 - i12 >= 0) {
                        break;
                    }
                    i15 = mix32(nextSeed()) >>> 1;
                }
            } else {
                while (true) {
                    if (mix32 >= i10 && mix32 < i11) {
                        return mix32;
                    }
                    mix32 = mix32(nextSeed());
                }
            }
            return i12 + i10;
        }
        return mix32;
    }

    final long internalNextLong(long j10, long j11) {
        long mix64 = mix64(nextSeed());
        if (j10 >= j11) {
            return mix64;
        }
        long j12 = j11 - j10;
        long j13 = j12 - 1;
        if ((j12 & j13) == 0) {
            return (mix64 & j13) + j10;
        }
        if (j12 > 0) {
            while (true) {
                long j14 = mix64 >>> 1;
                long j15 = j14 + j13;
                long j16 = j14 % j12;
                if (j15 - j16 >= 0) {
                    return j16 + j10;
                }
                mix64 = mix64(nextSeed());
            }
        } else {
            while (true) {
                if (mix64 >= j10 && mix64 < j11) {
                    return mix64;
                }
                mix64 = mix64(nextSeed());
            }
        }
    }

    @Override // java.util.Random
    public IntStream ints() {
        return StreamSupport.intStream(new RandomIntsSpliterator(0L, Long.MAX_VALUE, Integer.MAX_VALUE, 0), false);
    }

    @Override // java.util.Random
    public IntStream ints(int i10, int i11) {
        if (i10 < i11) {
            return StreamSupport.intStream(new RandomIntsSpliterator(0L, Long.MAX_VALUE, i10, i11), false);
        }
        throw new IllegalArgumentException("bound must be greater than origin");
    }

    @Override // java.util.Random
    public IntStream ints(long j10) {
        if (j10 >= 0) {
            return StreamSupport.intStream(new RandomIntsSpliterator(0L, j10, Integer.MAX_VALUE, 0), false);
        }
        throw new IllegalArgumentException("size must be non-negative");
    }

    @Override // java.util.Random
    public IntStream ints(long j10, int i10, int i11) {
        if (j10 >= 0) {
            if (i10 < i11) {
                return StreamSupport.intStream(new RandomIntsSpliterator(0L, j10, i10, i11), false);
            }
            throw new IllegalArgumentException("bound must be greater than origin");
        }
        throw new IllegalArgumentException("size must be non-negative");
    }

    @Override // java.util.Random
    public /* synthetic */ java.util.stream.IntStream ints() {
        return IntStream.Wrapper.convert(ints());
    }

    @Override // java.util.Random
    public /* synthetic */ java.util.stream.IntStream ints(int i10, int i11) {
        return IntStream.Wrapper.convert(ints(i10, i11));
    }

    @Override // java.util.Random
    public /* synthetic */ java.util.stream.IntStream ints(long j10) {
        return IntStream.Wrapper.convert(ints(j10));
    }

    @Override // java.util.Random
    public /* synthetic */ java.util.stream.IntStream ints(long j10, int i10, int i11) {
        return IntStream.Wrapper.convert(ints(j10, i10, i11));
    }

    @Override // java.util.Random
    public LongStream longs() {
        return StreamSupport.longStream(new RandomLongsSpliterator(0L, Long.MAX_VALUE, Long.MAX_VALUE, 0L), false);
    }

    @Override // java.util.Random
    public LongStream longs(long j10) {
        if (j10 >= 0) {
            return StreamSupport.longStream(new RandomLongsSpliterator(0L, j10, Long.MAX_VALUE, 0L), false);
        }
        throw new IllegalArgumentException("size must be non-negative");
    }

    @Override // java.util.Random
    public LongStream longs(long j10, long j11) {
        if (j10 < j11) {
            return StreamSupport.longStream(new RandomLongsSpliterator(0L, Long.MAX_VALUE, j10, j11), false);
        }
        throw new IllegalArgumentException("bound must be greater than origin");
    }

    @Override // java.util.Random
    public LongStream longs(long j10, long j11, long j12) {
        if (j10 >= 0) {
            if (j11 < j12) {
                return StreamSupport.longStream(new RandomLongsSpliterator(0L, j10, j11, j12), false);
            }
            throw new IllegalArgumentException("bound must be greater than origin");
        }
        throw new IllegalArgumentException("size must be non-negative");
    }

    @Override // java.util.Random
    public /* synthetic */ java.util.stream.LongStream longs() {
        return LongStream.Wrapper.convert(longs());
    }

    @Override // java.util.Random
    public /* synthetic */ java.util.stream.LongStream longs(long j10) {
        return LongStream.Wrapper.convert(longs(j10));
    }

    @Override // java.util.Random
    public /* synthetic */ java.util.stream.LongStream longs(long j10, long j11) {
        return LongStream.Wrapper.convert(longs(j10, j11));
    }

    @Override // java.util.Random
    public /* synthetic */ java.util.stream.LongStream longs(long j10, long j11, long j12) {
        return LongStream.Wrapper.convert(longs(j10, j11, j12));
    }

    @Override // java.util.Random
    protected int next(int i10) {
        return nextInt() >>> (32 - i10);
    }

    @Override // java.util.Random
    public boolean nextBoolean() {
        return mix32(nextSeed()) < 0;
    }

    @Override // java.util.Random
    public double nextDouble() {
        return (mix64(nextSeed()) >>> 11) * 1.1102230246251565E-16d;
    }

    public double nextDouble(double d10) {
        if (d10 > 0.0d) {
            double mix64 = (mix64(nextSeed()) >>> 11) * 1.1102230246251565E-16d * d10;
            return mix64 < d10 ? mix64 : Double.longBitsToDouble(Double.doubleToLongBits(d10) - 1);
        }
        throw new IllegalArgumentException("bound must be positive");
    }

    @Override // java.util.Random
    public float nextFloat() {
        return (mix32(nextSeed()) >>> 8) * 5.9604645E-8f;
    }

    @Override // java.util.Random
    public double nextGaussian() {
        ThreadLocal threadLocal = nextLocalGaussian;
        Double d10 = (Double) threadLocal.get();
        if (d10 != null) {
            threadLocal.set(null);
            return d10.doubleValue();
        }
        while (true) {
            double nextDouble = (nextDouble() * 2.0d) - 1.0d;
            double nextDouble2 = (nextDouble() * 2.0d) - 1.0d;
            double d11 = (nextDouble * nextDouble) + (nextDouble2 * nextDouble2);
            if (d11 < 1.0d && d11 != 0.0d) {
                double sqrt = StrictMath.sqrt((StrictMath.log(d11) * (-2.0d)) / d11);
                nextLocalGaussian.set(Double.valueOf(nextDouble2 * sqrt));
                return nextDouble * sqrt;
            }
        }
    }

    @Override // java.util.Random
    public int nextInt() {
        return mix32(nextSeed());
    }

    @Override // java.util.Random
    public int nextInt(int i10) {
        if (i10 <= 0) {
            throw new IllegalArgumentException("bound must be positive");
        }
        int mix32 = mix32(nextSeed());
        int i11 = i10 - 1;
        if ((i10 & i11) == 0) {
            return mix32 & i11;
        }
        while (true) {
            int i12 = mix32 >>> 1;
            int i13 = i12 + i11;
            int i14 = i12 % i10;
            if (i13 - i14 >= 0) {
                return i14;
            }
            mix32 = mix32(nextSeed());
        }
    }

    public int nextInt(int i10, int i11) {
        if (i10 < i11) {
            return internalNextInt(i10, i11);
        }
        throw new IllegalArgumentException("bound must be greater than origin");
    }

    @Override // java.util.Random
    public long nextLong() {
        return mix64(nextSeed());
    }

    final long nextSeed() {
        long j10 = this.threadLocalRandomSeed - 7046029254386353131L;
        this.threadLocalRandomSeed = j10;
        return j10;
    }

    @Override // java.util.Random
    public void setSeed(long j10) {
        if (this.initialized) {
            throw new UnsupportedOperationException();
        }
    }
}
