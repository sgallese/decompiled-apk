package j$.util.stream;

import j$.util.Objects;
import j$.util.function.Consumer$CC;
import j$.util.function.DoubleConsumer$CC;
import j$.util.function.IntConsumer$CC;
import j$.util.function.LongConsumer$CC;
import java.util.function.Consumer;
import java.util.function.DoubleConsumer;
import java.util.function.IntConsumer;
import java.util.function.LongConsumer;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes2.dex */
public interface Sink extends Consumer {

    /* renamed from: j$.util.stream.Sink$-CC  reason: invalid class name */
    /* loaded from: classes2.dex */
    public abstract /* synthetic */ class CC {
        public static void $default$accept(Sink sink, double d10) {
            throw new IllegalStateException("called wrong accept method");
        }

        public static void $default$accept(Sink sink, int i10) {
            throw new IllegalStateException("called wrong accept method");
        }

        public static void $default$accept(Sink sink, long j10) {
            throw new IllegalStateException("called wrong accept method");
        }

        public static void $default$begin(Sink sink, long j10) {
        }

        public static boolean $default$cancellationRequested(Sink sink) {
            return false;
        }

        public static void $default$end(Sink sink) {
        }
    }

    /* loaded from: classes2.dex */
    public static abstract class ChainedDouble implements OfDouble {
        protected final Sink downstream;

        public ChainedDouble(Sink sink) {
            this.downstream = (Sink) Objects.requireNonNull(sink);
        }

        @Override // j$.util.stream.Sink
        public /* synthetic */ void accept(int i10) {
            CC.$default$accept((Sink) this, i10);
        }

        @Override // j$.util.stream.Sink
        public /* synthetic */ void accept(long j10) {
            CC.$default$accept((Sink) this, j10);
        }

        @Override // j$.util.stream.Sink.OfDouble
        public /* synthetic */ void accept(Double d10) {
            OfDouble.CC.$default$accept((OfDouble) this, d10);
        }

        @Override // java.util.function.Consumer
        public /* bridge */ /* synthetic */ void accept(Object obj) {
            OfDouble.CC.$default$accept(this, obj);
        }

        public /* synthetic */ Consumer andThen(Consumer consumer) {
            return Consumer$CC.$default$andThen(this, consumer);
        }

        public /* synthetic */ DoubleConsumer andThen(DoubleConsumer doubleConsumer) {
            return DoubleConsumer$CC.$default$andThen(this, doubleConsumer);
        }

        @Override // j$.util.stream.Sink
        public void begin(long j10) {
            this.downstream.begin(j10);
        }

        @Override // j$.util.stream.Sink
        public boolean cancellationRequested() {
            return this.downstream.cancellationRequested();
        }

        @Override // j$.util.stream.Sink
        public void end() {
            this.downstream.end();
        }
    }

    /* loaded from: classes2.dex */
    public static abstract class ChainedInt implements OfInt {
        protected final Sink downstream;

        public ChainedInt(Sink sink) {
            this.downstream = (Sink) Objects.requireNonNull(sink);
        }

        @Override // j$.util.stream.Sink, java.util.function.DoubleConsumer
        public /* synthetic */ void accept(double d10) {
            CC.$default$accept(this, d10);
        }

        @Override // j$.util.stream.Sink
        public /* synthetic */ void accept(long j10) {
            CC.$default$accept((Sink) this, j10);
        }

        @Override // j$.util.stream.Sink.OfInt
        public /* synthetic */ void accept(Integer num) {
            OfInt.CC.$default$accept((OfInt) this, num);
        }

        @Override // java.util.function.Consumer
        public /* bridge */ /* synthetic */ void accept(Object obj) {
            OfInt.CC.$default$accept(this, obj);
        }

        public /* synthetic */ Consumer andThen(Consumer consumer) {
            return Consumer$CC.$default$andThen(this, consumer);
        }

        public /* synthetic */ IntConsumer andThen(IntConsumer intConsumer) {
            return IntConsumer$CC.$default$andThen(this, intConsumer);
        }

        @Override // j$.util.stream.Sink
        public void begin(long j10) {
            this.downstream.begin(j10);
        }

        @Override // j$.util.stream.Sink
        public boolean cancellationRequested() {
            return this.downstream.cancellationRequested();
        }

        @Override // j$.util.stream.Sink
        public void end() {
            this.downstream.end();
        }
    }

    /* loaded from: classes2.dex */
    public static abstract class ChainedLong implements OfLong {
        protected final Sink downstream;

        public ChainedLong(Sink sink) {
            this.downstream = (Sink) Objects.requireNonNull(sink);
        }

        @Override // j$.util.stream.Sink, java.util.function.DoubleConsumer
        public /* synthetic */ void accept(double d10) {
            CC.$default$accept(this, d10);
        }

        @Override // j$.util.stream.Sink
        public /* synthetic */ void accept(int i10) {
            CC.$default$accept((Sink) this, i10);
        }

        @Override // j$.util.stream.Sink.OfLong
        public /* synthetic */ void accept(Long l10) {
            OfLong.CC.$default$accept((OfLong) this, l10);
        }

        @Override // java.util.function.Consumer
        public /* bridge */ /* synthetic */ void accept(Object obj) {
            OfLong.CC.$default$accept(this, obj);
        }

        public /* synthetic */ Consumer andThen(Consumer consumer) {
            return Consumer$CC.$default$andThen(this, consumer);
        }

        public /* synthetic */ LongConsumer andThen(LongConsumer longConsumer) {
            return LongConsumer$CC.$default$andThen(this, longConsumer);
        }

        @Override // j$.util.stream.Sink
        public void begin(long j10) {
            this.downstream.begin(j10);
        }

        @Override // j$.util.stream.Sink
        public boolean cancellationRequested() {
            return this.downstream.cancellationRequested();
        }

        @Override // j$.util.stream.Sink
        public void end() {
            this.downstream.end();
        }
    }

    /* loaded from: classes2.dex */
    public static abstract class ChainedReference implements Sink {
        protected final Sink downstream;

        public ChainedReference(Sink sink) {
            this.downstream = (Sink) Objects.requireNonNull(sink);
        }

        @Override // j$.util.stream.Sink, java.util.function.DoubleConsumer
        public /* synthetic */ void accept(double d10) {
            CC.$default$accept(this, d10);
        }

        @Override // j$.util.stream.Sink
        public /* synthetic */ void accept(int i10) {
            CC.$default$accept((Sink) this, i10);
        }

        @Override // j$.util.stream.Sink
        public /* synthetic */ void accept(long j10) {
            CC.$default$accept((Sink) this, j10);
        }

        public /* synthetic */ Consumer andThen(Consumer consumer) {
            return Consumer$CC.$default$andThen(this, consumer);
        }

        @Override // j$.util.stream.Sink
        public void begin(long j10) {
            this.downstream.begin(j10);
        }

        @Override // j$.util.stream.Sink
        public boolean cancellationRequested() {
            return this.downstream.cancellationRequested();
        }

        @Override // j$.util.stream.Sink
        public void end() {
            this.downstream.end();
        }
    }

    /* loaded from: classes2.dex */
    public interface OfDouble extends Sink, DoubleConsumer {

        /* renamed from: j$.util.stream.Sink$OfDouble$-CC  reason: invalid class name */
        /* loaded from: classes2.dex */
        public abstract /* synthetic */ class CC {
            public static void $default$accept(OfDouble ofDouble, Double d10) {
                if (Tripwire.ENABLED) {
                    Tripwire.trip(ofDouble.getClass(), "{0} calling Sink.OfDouble.accept(Double)");
                }
                ofDouble.accept(d10.doubleValue());
            }

            public static /* bridge */ /* synthetic */ void $default$accept(OfDouble ofDouble, Object obj) {
                ofDouble.accept((Double) obj);
            }
        }

        @Override // j$.util.stream.Sink, java.util.function.DoubleConsumer
        void accept(double d10);

        void accept(Double d10);
    }

    /* loaded from: classes2.dex */
    public interface OfInt extends Sink, IntConsumer {

        /* renamed from: j$.util.stream.Sink$OfInt$-CC  reason: invalid class name */
        /* loaded from: classes2.dex */
        public abstract /* synthetic */ class CC {
            public static void $default$accept(OfInt ofInt, Integer num) {
                if (Tripwire.ENABLED) {
                    Tripwire.trip(ofInt.getClass(), "{0} calling Sink.OfInt.accept(Integer)");
                }
                ofInt.accept(num.intValue());
            }

            public static /* bridge */ /* synthetic */ void $default$accept(OfInt ofInt, Object obj) {
                ofInt.accept((Integer) obj);
            }
        }

        @Override // j$.util.stream.Sink
        void accept(int i10);

        void accept(Integer num);
    }

    /* loaded from: classes2.dex */
    public interface OfLong extends Sink, LongConsumer {

        /* renamed from: j$.util.stream.Sink$OfLong$-CC  reason: invalid class name */
        /* loaded from: classes2.dex */
        public abstract /* synthetic */ class CC {
            public static void $default$accept(OfLong ofLong, Long l10) {
                if (Tripwire.ENABLED) {
                    Tripwire.trip(ofLong.getClass(), "{0} calling Sink.OfLong.accept(Long)");
                }
                ofLong.accept(l10.longValue());
            }

            public static /* bridge */ /* synthetic */ void $default$accept(OfLong ofLong, Object obj) {
                ofLong.accept((Long) obj);
            }
        }

        @Override // j$.util.stream.Sink
        void accept(long j10);

        void accept(Long l10);
    }

    void accept(double d10);

    void accept(int i10);

    void accept(long j10);

    void begin(long j10);

    boolean cancellationRequested();

    void end();
}
