package j$.util.stream;

import j$.util.Collection;
import j$.util.Comparator;
import j$.util.List;
import j$.util.Objects;
import j$.util.Spliterator;
import j$.util.function.Consumer$CC;
import j$.util.stream.DoublePipeline;
import j$.util.stream.IntPipeline;
import j$.util.stream.LongPipeline;
import j$.util.stream.Node;
import j$.util.stream.ReferencePipeline;
import j$.util.stream.Sink;
import j$.util.stream.SpinedBuffer;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.Iterator;
import java.util.function.Consumer;
import java.util.function.IntFunction;

/* loaded from: classes2.dex */
abstract class SortedOps {

    /* loaded from: classes2.dex */
    private static abstract class AbstractDoubleSortingSink extends Sink.ChainedDouble {
        protected boolean cancellationRequestedCalled;

        AbstractDoubleSortingSink(Sink sink) {
            super(sink);
        }

        @Override // j$.util.stream.Sink.ChainedDouble, j$.util.stream.Sink
        public final boolean cancellationRequested() {
            this.cancellationRequestedCalled = true;
            return false;
        }
    }

    /* loaded from: classes2.dex */
    private static abstract class AbstractIntSortingSink extends Sink.ChainedInt {
        protected boolean cancellationRequestedCalled;

        AbstractIntSortingSink(Sink sink) {
            super(sink);
        }

        @Override // j$.util.stream.Sink.ChainedInt, j$.util.stream.Sink
        public final boolean cancellationRequested() {
            this.cancellationRequestedCalled = true;
            return false;
        }
    }

    /* loaded from: classes2.dex */
    private static abstract class AbstractLongSortingSink extends Sink.ChainedLong {
        protected boolean cancellationRequestedCalled;

        AbstractLongSortingSink(Sink sink) {
            super(sink);
        }

        @Override // j$.util.stream.Sink.ChainedLong, j$.util.stream.Sink
        public final boolean cancellationRequested() {
            this.cancellationRequestedCalled = true;
            return false;
        }
    }

    /* loaded from: classes2.dex */
    private static abstract class AbstractRefSortingSink extends Sink.ChainedReference {
        protected boolean cancellationRequestedCalled;
        protected final Comparator comparator;

        AbstractRefSortingSink(Sink sink, Comparator comparator) {
            super(sink);
            this.comparator = comparator;
        }

        @Override // j$.util.stream.Sink.ChainedReference, j$.util.stream.Sink
        public final boolean cancellationRequested() {
            this.cancellationRequestedCalled = true;
            return false;
        }
    }

    /* loaded from: classes2.dex */
    private static final class DoubleSortingSink extends AbstractDoubleSortingSink {

        /* renamed from: b  reason: collision with root package name */
        private SpinedBuffer.OfDouble f18482b;

        DoubleSortingSink(Sink sink) {
            super(sink);
        }

        @Override // j$.util.stream.Sink.OfDouble, j$.util.stream.Sink, java.util.function.DoubleConsumer
        public void accept(double d10) {
            this.f18482b.accept(d10);
        }

        @Override // j$.util.stream.Sink.ChainedDouble, j$.util.stream.Sink
        public void begin(long j10) {
            if (j10 >= 2147483639) {
                throw new IllegalArgumentException("Stream size exceeds max array size");
            }
            this.f18482b = j10 > 0 ? new SpinedBuffer.OfDouble((int) j10) : new SpinedBuffer.OfDouble();
        }

        @Override // j$.util.stream.Sink.ChainedDouble, j$.util.stream.Sink
        public void end() {
            double[] dArr = (double[]) this.f18482b.asPrimitiveArray();
            Arrays.sort(dArr);
            this.downstream.begin(dArr.length);
            int i10 = 0;
            if (this.cancellationRequestedCalled) {
                int length = dArr.length;
                while (i10 < length) {
                    double d10 = dArr[i10];
                    if (this.downstream.cancellationRequested()) {
                        break;
                    }
                    this.downstream.accept(d10);
                    i10++;
                }
            } else {
                int length2 = dArr.length;
                while (i10 < length2) {
                    this.downstream.accept(dArr[i10]);
                    i10++;
                }
            }
            this.downstream.end();
        }
    }

    /* loaded from: classes2.dex */
    private static final class IntSortingSink extends AbstractIntSortingSink {

        /* renamed from: b  reason: collision with root package name */
        private SpinedBuffer.OfInt f18483b;

        IntSortingSink(Sink sink) {
            super(sink);
        }

        @Override // j$.util.stream.Sink.OfInt, j$.util.stream.Sink
        public void accept(int i10) {
            this.f18483b.accept(i10);
        }

        @Override // j$.util.stream.Sink.ChainedInt, j$.util.stream.Sink
        public void begin(long j10) {
            if (j10 >= 2147483639) {
                throw new IllegalArgumentException("Stream size exceeds max array size");
            }
            this.f18483b = j10 > 0 ? new SpinedBuffer.OfInt((int) j10) : new SpinedBuffer.OfInt();
        }

        @Override // j$.util.stream.Sink.ChainedInt, j$.util.stream.Sink
        public void end() {
            int[] iArr = (int[]) this.f18483b.asPrimitiveArray();
            Arrays.sort(iArr);
            this.downstream.begin(iArr.length);
            int i10 = 0;
            if (this.cancellationRequestedCalled) {
                int length = iArr.length;
                while (i10 < length) {
                    int i11 = iArr[i10];
                    if (this.downstream.cancellationRequested()) {
                        break;
                    }
                    this.downstream.accept(i11);
                    i10++;
                }
            } else {
                int length2 = iArr.length;
                while (i10 < length2) {
                    this.downstream.accept(iArr[i10]);
                    i10++;
                }
            }
            this.downstream.end();
        }
    }

    /* loaded from: classes2.dex */
    private static final class LongSortingSink extends AbstractLongSortingSink {

        /* renamed from: b  reason: collision with root package name */
        private SpinedBuffer.OfLong f18484b;

        LongSortingSink(Sink sink) {
            super(sink);
        }

        @Override // j$.util.stream.Sink.OfLong, j$.util.stream.Sink
        public void accept(long j10) {
            this.f18484b.accept(j10);
        }

        @Override // j$.util.stream.Sink.ChainedLong, j$.util.stream.Sink
        public void begin(long j10) {
            if (j10 >= 2147483639) {
                throw new IllegalArgumentException("Stream size exceeds max array size");
            }
            this.f18484b = j10 > 0 ? new SpinedBuffer.OfLong((int) j10) : new SpinedBuffer.OfLong();
        }

        @Override // j$.util.stream.Sink.ChainedLong, j$.util.stream.Sink
        public void end() {
            long[] jArr = (long[]) this.f18484b.asPrimitiveArray();
            Arrays.sort(jArr);
            this.downstream.begin(jArr.length);
            int i10 = 0;
            if (this.cancellationRequestedCalled) {
                int length = jArr.length;
                while (i10 < length) {
                    long j10 = jArr[i10];
                    if (this.downstream.cancellationRequested()) {
                        break;
                    }
                    this.downstream.accept(j10);
                    i10++;
                }
            } else {
                int length2 = jArr.length;
                while (i10 < length2) {
                    this.downstream.accept(jArr[i10]);
                    i10++;
                }
            }
            this.downstream.end();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* loaded from: classes2.dex */
    public static final class OfDouble extends DoublePipeline.StatefulOp {
        OfDouble(AbstractPipeline abstractPipeline) {
            super(abstractPipeline, StreamShape.DOUBLE_VALUE, StreamOpFlag.IS_ORDERED | StreamOpFlag.IS_SORTED);
        }

        @Override // j$.util.stream.AbstractPipeline
        public Node opEvaluateParallel(PipelineHelper pipelineHelper, Spliterator spliterator, IntFunction intFunction) {
            if (StreamOpFlag.SORTED.isKnown(pipelineHelper.getStreamAndOpFlags())) {
                return pipelineHelper.evaluate(spliterator, false, intFunction);
            }
            double[] dArr = (double[]) ((Node.OfDouble) pipelineHelper.evaluate(spliterator, true, intFunction)).asPrimitiveArray();
            Arrays.sort(dArr);
            return Nodes.node(dArr);
        }

        @Override // j$.util.stream.AbstractPipeline
        public Sink opWrapSink(int i10, Sink sink) {
            Objects.requireNonNull(sink);
            return StreamOpFlag.SORTED.isKnown(i10) ? sink : StreamOpFlag.SIZED.isKnown(i10) ? new SizedDoubleSortingSink(sink) : new DoubleSortingSink(sink);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* loaded from: classes2.dex */
    public static final class OfInt extends IntPipeline.StatefulOp {
        OfInt(AbstractPipeline abstractPipeline) {
            super(abstractPipeline, StreamShape.INT_VALUE, StreamOpFlag.IS_ORDERED | StreamOpFlag.IS_SORTED);
        }

        @Override // j$.util.stream.AbstractPipeline
        public Node opEvaluateParallel(PipelineHelper pipelineHelper, Spliterator spliterator, IntFunction intFunction) {
            if (StreamOpFlag.SORTED.isKnown(pipelineHelper.getStreamAndOpFlags())) {
                return pipelineHelper.evaluate(spliterator, false, intFunction);
            }
            int[] iArr = (int[]) ((Node.OfInt) pipelineHelper.evaluate(spliterator, true, intFunction)).asPrimitiveArray();
            Arrays.sort(iArr);
            return Nodes.node(iArr);
        }

        @Override // j$.util.stream.AbstractPipeline
        public Sink opWrapSink(int i10, Sink sink) {
            Objects.requireNonNull(sink);
            return StreamOpFlag.SORTED.isKnown(i10) ? sink : StreamOpFlag.SIZED.isKnown(i10) ? new SizedIntSortingSink(sink) : new IntSortingSink(sink);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* loaded from: classes2.dex */
    public static final class OfLong extends LongPipeline.StatefulOp {
        OfLong(AbstractPipeline abstractPipeline) {
            super(abstractPipeline, StreamShape.LONG_VALUE, StreamOpFlag.IS_ORDERED | StreamOpFlag.IS_SORTED);
        }

        @Override // j$.util.stream.AbstractPipeline
        public Node opEvaluateParallel(PipelineHelper pipelineHelper, Spliterator spliterator, IntFunction intFunction) {
            if (StreamOpFlag.SORTED.isKnown(pipelineHelper.getStreamAndOpFlags())) {
                return pipelineHelper.evaluate(spliterator, false, intFunction);
            }
            long[] jArr = (long[]) ((Node.OfLong) pipelineHelper.evaluate(spliterator, true, intFunction)).asPrimitiveArray();
            Arrays.sort(jArr);
            return Nodes.node(jArr);
        }

        @Override // j$.util.stream.AbstractPipeline
        public Sink opWrapSink(int i10, Sink sink) {
            Objects.requireNonNull(sink);
            return StreamOpFlag.SORTED.isKnown(i10) ? sink : StreamOpFlag.SIZED.isKnown(i10) ? new SizedLongSortingSink(sink) : new LongSortingSink(sink);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* loaded from: classes2.dex */
    public static final class OfRef extends ReferencePipeline.StatefulOp {
        private final Comparator comparator;
        private final boolean isNaturalSort;

        OfRef(AbstractPipeline abstractPipeline) {
            super(abstractPipeline, StreamShape.REFERENCE, StreamOpFlag.IS_ORDERED | StreamOpFlag.IS_SORTED);
            this.isNaturalSort = true;
            this.comparator = Comparator.CC.naturalOrder();
        }

        OfRef(AbstractPipeline abstractPipeline, java.util.Comparator comparator) {
            super(abstractPipeline, StreamShape.REFERENCE, StreamOpFlag.IS_ORDERED | StreamOpFlag.NOT_SORTED);
            this.isNaturalSort = false;
            this.comparator = (java.util.Comparator) Objects.requireNonNull(comparator);
        }

        @Override // j$.util.stream.AbstractPipeline
        public Node opEvaluateParallel(PipelineHelper pipelineHelper, Spliterator spliterator, IntFunction intFunction) {
            if (StreamOpFlag.SORTED.isKnown(pipelineHelper.getStreamAndOpFlags()) && this.isNaturalSort) {
                return pipelineHelper.evaluate(spliterator, false, intFunction);
            }
            Object[] asArray = pipelineHelper.evaluate(spliterator, true, intFunction).asArray(intFunction);
            Arrays.sort(asArray, this.comparator);
            return Nodes.node(asArray);
        }

        @Override // j$.util.stream.AbstractPipeline
        public Sink opWrapSink(int i10, Sink sink) {
            Objects.requireNonNull(sink);
            return (StreamOpFlag.SORTED.isKnown(i10) && this.isNaturalSort) ? sink : StreamOpFlag.SIZED.isKnown(i10) ? new SizedRefSortingSink(sink, this.comparator) : new RefSortingSink(sink, this.comparator);
        }
    }

    /* loaded from: classes2.dex */
    private static final class RefSortingSink extends AbstractRefSortingSink {
        private ArrayList list;

        RefSortingSink(Sink sink, java.util.Comparator comparator) {
            super(sink, comparator);
        }

        @Override // java.util.function.Consumer
        public void accept(Object obj) {
            this.list.add(obj);
        }

        @Override // j$.util.stream.Sink.ChainedReference, j$.util.stream.Sink
        public void begin(long j10) {
            if (j10 >= 2147483639) {
                throw new IllegalArgumentException("Stream size exceeds max array size");
            }
            this.list = j10 >= 0 ? new ArrayList((int) j10) : new ArrayList();
        }

        @Override // j$.util.stream.Sink.ChainedReference, j$.util.stream.Sink
        public void end() {
            List.EL.sort(this.list, this.comparator);
            this.downstream.begin(this.list.size());
            if (this.cancellationRequestedCalled) {
                Iterator it = this.list.iterator();
                while (it.hasNext()) {
                    Object next = it.next();
                    if (this.downstream.cancellationRequested()) {
                        break;
                    }
                    this.downstream.accept((Sink) next);
                }
            } else {
                ArrayList arrayList = this.list;
                final Sink sink = this.downstream;
                Objects.requireNonNull(sink);
                Collection.EL.forEach(arrayList, new Consumer() { // from class: j$.util.stream.SortedOps$RefSortingSink$$ExternalSyntheticLambda0
                    @Override // java.util.function.Consumer
                    public final void accept(Object obj) {
                        Sink.this.accept((Sink) obj);
                    }

                    public /* synthetic */ Consumer andThen(Consumer consumer) {
                        return Consumer$CC.$default$andThen(this, consumer);
                    }
                });
            }
            this.downstream.end();
            this.list = null;
        }
    }

    /* loaded from: classes2.dex */
    private static final class SizedDoubleSortingSink extends AbstractDoubleSortingSink {
        private double[] array;
        private int offset;

        SizedDoubleSortingSink(Sink sink) {
            super(sink);
        }

        @Override // j$.util.stream.Sink.OfDouble, j$.util.stream.Sink, java.util.function.DoubleConsumer
        public void accept(double d10) {
            double[] dArr = this.array;
            int i10 = this.offset;
            this.offset = i10 + 1;
            dArr[i10] = d10;
        }

        @Override // j$.util.stream.Sink.ChainedDouble, j$.util.stream.Sink
        public void begin(long j10) {
            if (j10 >= 2147483639) {
                throw new IllegalArgumentException("Stream size exceeds max array size");
            }
            this.array = new double[(int) j10];
        }

        @Override // j$.util.stream.Sink.ChainedDouble, j$.util.stream.Sink
        public void end() {
            int i10 = 0;
            Arrays.sort(this.array, 0, this.offset);
            this.downstream.begin(this.offset);
            if (this.cancellationRequestedCalled) {
                while (i10 < this.offset && !this.downstream.cancellationRequested()) {
                    this.downstream.accept(this.array[i10]);
                    i10++;
                }
            } else {
                while (i10 < this.offset) {
                    this.downstream.accept(this.array[i10]);
                    i10++;
                }
            }
            this.downstream.end();
            this.array = null;
        }
    }

    /* loaded from: classes2.dex */
    private static final class SizedIntSortingSink extends AbstractIntSortingSink {
        private int[] array;
        private int offset;

        SizedIntSortingSink(Sink sink) {
            super(sink);
        }

        @Override // j$.util.stream.Sink.OfInt, j$.util.stream.Sink
        public void accept(int i10) {
            int[] iArr = this.array;
            int i11 = this.offset;
            this.offset = i11 + 1;
            iArr[i11] = i10;
        }

        @Override // j$.util.stream.Sink.ChainedInt, j$.util.stream.Sink
        public void begin(long j10) {
            if (j10 >= 2147483639) {
                throw new IllegalArgumentException("Stream size exceeds max array size");
            }
            this.array = new int[(int) j10];
        }

        @Override // j$.util.stream.Sink.ChainedInt, j$.util.stream.Sink
        public void end() {
            int i10 = 0;
            Arrays.sort(this.array, 0, this.offset);
            this.downstream.begin(this.offset);
            if (this.cancellationRequestedCalled) {
                while (i10 < this.offset && !this.downstream.cancellationRequested()) {
                    this.downstream.accept(this.array[i10]);
                    i10++;
                }
            } else {
                while (i10 < this.offset) {
                    this.downstream.accept(this.array[i10]);
                    i10++;
                }
            }
            this.downstream.end();
            this.array = null;
        }
    }

    /* loaded from: classes2.dex */
    private static final class SizedLongSortingSink extends AbstractLongSortingSink {
        private long[] array;
        private int offset;

        SizedLongSortingSink(Sink sink) {
            super(sink);
        }

        @Override // j$.util.stream.Sink.OfLong, j$.util.stream.Sink
        public void accept(long j10) {
            long[] jArr = this.array;
            int i10 = this.offset;
            this.offset = i10 + 1;
            jArr[i10] = j10;
        }

        @Override // j$.util.stream.Sink.ChainedLong, j$.util.stream.Sink
        public void begin(long j10) {
            if (j10 >= 2147483639) {
                throw new IllegalArgumentException("Stream size exceeds max array size");
            }
            this.array = new long[(int) j10];
        }

        @Override // j$.util.stream.Sink.ChainedLong, j$.util.stream.Sink
        public void end() {
            int i10 = 0;
            Arrays.sort(this.array, 0, this.offset);
            this.downstream.begin(this.offset);
            if (this.cancellationRequestedCalled) {
                while (i10 < this.offset && !this.downstream.cancellationRequested()) {
                    this.downstream.accept(this.array[i10]);
                    i10++;
                }
            } else {
                while (i10 < this.offset) {
                    this.downstream.accept(this.array[i10]);
                    i10++;
                }
            }
            this.downstream.end();
            this.array = null;
        }
    }

    /* loaded from: classes2.dex */
    private static final class SizedRefSortingSink extends AbstractRefSortingSink {
        private Object[] array;
        private int offset;

        SizedRefSortingSink(Sink sink, java.util.Comparator comparator) {
            super(sink, comparator);
        }

        @Override // java.util.function.Consumer
        public void accept(Object obj) {
            Object[] objArr = this.array;
            int i10 = this.offset;
            this.offset = i10 + 1;
            objArr[i10] = obj;
        }

        @Override // j$.util.stream.Sink.ChainedReference, j$.util.stream.Sink
        public void begin(long j10) {
            if (j10 >= 2147483639) {
                throw new IllegalArgumentException("Stream size exceeds max array size");
            }
            this.array = new Object[(int) j10];
        }

        @Override // j$.util.stream.Sink.ChainedReference, j$.util.stream.Sink
        public void end() {
            int i10 = 0;
            Arrays.sort(this.array, 0, this.offset, this.comparator);
            this.downstream.begin(this.offset);
            if (this.cancellationRequestedCalled) {
                while (i10 < this.offset && !this.downstream.cancellationRequested()) {
                    this.downstream.accept((Sink) this.array[i10]);
                    i10++;
                }
            } else {
                while (i10 < this.offset) {
                    this.downstream.accept((Sink) this.array[i10]);
                    i10++;
                }
            }
            this.downstream.end();
            this.array = null;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static DoubleStream makeDouble(AbstractPipeline abstractPipeline) {
        return new OfDouble(abstractPipeline);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static IntStream makeInt(AbstractPipeline abstractPipeline) {
        return new OfInt(abstractPipeline);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static LongStream makeLong(AbstractPipeline abstractPipeline) {
        return new OfLong(abstractPipeline);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static Stream makeRef(AbstractPipeline abstractPipeline) {
        return new OfRef(abstractPipeline);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static Stream makeRef(AbstractPipeline abstractPipeline, java.util.Comparator comparator) {
        return new OfRef(abstractPipeline, comparator);
    }
}
