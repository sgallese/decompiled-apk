package j$.util.stream;

import j$.util.LongSummaryStatistics;
import j$.util.Objects;
import j$.util.OptionalDouble;
import j$.util.OptionalLong;
import j$.util.PrimitiveIterator;
import j$.util.Spliterator;
import j$.util.Spliterators;
import j$.util.function.BiConsumer$CC;
import j$.util.function.BiFunction$CC;
import j$.util.stream.DoublePipeline;
import j$.util.stream.IntPipeline;
import j$.util.stream.MatchOps;
import j$.util.stream.Node;
import j$.util.stream.ReferencePipeline;
import j$.util.stream.Sink;
import j$.util.stream.StreamSpliterators$DelegatingSpliterator;
import java.util.Iterator;
import java.util.function.BiConsumer;
import java.util.function.BiFunction;
import java.util.function.BinaryOperator;
import java.util.function.Function;
import java.util.function.IntFunction;
import java.util.function.LongBinaryOperator;
import java.util.function.LongConsumer;
import java.util.function.LongFunction;
import java.util.function.LongPredicate;
import java.util.function.LongToDoubleFunction;
import java.util.function.LongToIntFunction;
import java.util.function.LongUnaryOperator;
import java.util.function.ObjLongConsumer;
import java.util.function.Supplier;
import java.util.function.ToLongFunction;

/* loaded from: classes2.dex */
abstract class LongPipeline extends AbstractPipeline implements LongStream {

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes2.dex */
    public static class Head extends LongPipeline {
        /* JADX INFO: Access modifiers changed from: package-private */
        public Head(Spliterator spliterator, int i10, boolean z10) {
            super(spliterator, i10, z10);
        }

        @Override // j$.util.stream.LongPipeline, j$.util.stream.LongStream
        public void forEach(LongConsumer longConsumer) {
            if (isParallel()) {
                super.forEach(longConsumer);
            } else {
                LongPipeline.adapt(sourceStageSpliterator()).forEachRemaining(longConsumer);
            }
        }

        @Override // j$.util.stream.LongPipeline, j$.util.stream.LongStream
        public void forEachOrdered(LongConsumer longConsumer) {
            if (isParallel()) {
                super.forEachOrdered(longConsumer);
            } else {
                LongPipeline.adapt(sourceStageSpliterator()).forEachRemaining(longConsumer);
            }
        }

        @Override // j$.util.stream.BaseStream
        public /* bridge */ /* synthetic */ Iterator iterator() {
            return super.iterator();
        }

        @Override // j$.util.stream.AbstractPipeline
        /* bridge */ /* synthetic */ Spliterator lazySpliterator(Supplier supplier) {
            return super.lazySpliterator(supplier);
        }

        @Override // j$.util.stream.AbstractPipeline
        final boolean opIsStateful() {
            throw new UnsupportedOperationException();
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        @Override // j$.util.stream.AbstractPipeline
        public final Sink opWrapSink(int i10, Sink sink) {
            throw new UnsupportedOperationException();
        }

        @Override // j$.util.stream.AbstractPipeline, j$.util.stream.BaseStream
        public /* bridge */ /* synthetic */ LongStream parallel() {
            return (LongStream) super.parallel();
        }

        @Override // j$.util.stream.AbstractPipeline, j$.util.stream.BaseStream
        public /* bridge */ /* synthetic */ LongStream sequential() {
            return (LongStream) super.sequential();
        }

        @Override // j$.util.stream.AbstractPipeline, j$.util.stream.BaseStream
        public /* bridge */ /* synthetic */ Spliterator spliterator() {
            return super.spliterator();
        }

        @Override // j$.util.stream.BaseStream
        public /* bridge */ /* synthetic */ BaseStream unordered() {
            return super.unordered();
        }
    }

    /* loaded from: classes2.dex */
    static abstract class StatefulOp extends LongPipeline {
        /* JADX INFO: Access modifiers changed from: package-private */
        public StatefulOp(AbstractPipeline abstractPipeline, StreamShape streamShape, int i10) {
            super(abstractPipeline, i10);
        }

        @Override // j$.util.stream.BaseStream
        public /* bridge */ /* synthetic */ Iterator iterator() {
            return super.iterator();
        }

        @Override // j$.util.stream.AbstractPipeline
        /* bridge */ /* synthetic */ Spliterator lazySpliterator(Supplier supplier) {
            return super.lazySpliterator(supplier);
        }

        @Override // j$.util.stream.AbstractPipeline
        final boolean opIsStateful() {
            return true;
        }

        @Override // j$.util.stream.AbstractPipeline, j$.util.stream.BaseStream
        public /* bridge */ /* synthetic */ LongStream parallel() {
            return (LongStream) super.parallel();
        }

        @Override // j$.util.stream.AbstractPipeline, j$.util.stream.BaseStream
        public /* bridge */ /* synthetic */ LongStream sequential() {
            return (LongStream) super.sequential();
        }

        @Override // j$.util.stream.AbstractPipeline, j$.util.stream.BaseStream
        public /* bridge */ /* synthetic */ Spliterator spliterator() {
            return super.spliterator();
        }

        @Override // j$.util.stream.BaseStream
        public /* bridge */ /* synthetic */ BaseStream unordered() {
            return super.unordered();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes2.dex */
    public static abstract class StatelessOp extends LongPipeline {
        /* JADX INFO: Access modifiers changed from: package-private */
        public StatelessOp(AbstractPipeline abstractPipeline, StreamShape streamShape, int i10) {
            super(abstractPipeline, i10);
        }

        @Override // j$.util.stream.BaseStream
        public /* bridge */ /* synthetic */ Iterator iterator() {
            return super.iterator();
        }

        @Override // j$.util.stream.AbstractPipeline
        /* bridge */ /* synthetic */ Spliterator lazySpliterator(Supplier supplier) {
            return super.lazySpliterator(supplier);
        }

        @Override // j$.util.stream.AbstractPipeline
        final boolean opIsStateful() {
            return false;
        }

        @Override // j$.util.stream.AbstractPipeline, j$.util.stream.BaseStream
        public /* bridge */ /* synthetic */ LongStream parallel() {
            return (LongStream) super.parallel();
        }

        @Override // j$.util.stream.AbstractPipeline, j$.util.stream.BaseStream
        public /* bridge */ /* synthetic */ LongStream sequential() {
            return (LongStream) super.sequential();
        }

        @Override // j$.util.stream.AbstractPipeline, j$.util.stream.BaseStream
        public /* bridge */ /* synthetic */ Spliterator spliterator() {
            return super.spliterator();
        }

        @Override // j$.util.stream.BaseStream
        public /* bridge */ /* synthetic */ BaseStream unordered() {
            return super.unordered();
        }
    }

    LongPipeline(Spliterator spliterator, int i10, boolean z10) {
        super(spliterator, i10, z10);
    }

    LongPipeline(AbstractPipeline abstractPipeline, int i10) {
        super(abstractPipeline, i10);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static Spliterator.OfLong adapt(Spliterator spliterator) {
        if (spliterator instanceof Spliterator.OfLong) {
            return (Spliterator.OfLong) spliterator;
        }
        if (Tripwire.ENABLED) {
            Tripwire.trip(AbstractPipeline.class, "using LongStream.adapt(Spliterator<Long> s)");
        }
        throw new UnsupportedOperationException("LongStream.adapt(Spliterator<Long> s)");
    }

    private static LongConsumer adapt(Sink sink) {
        if (sink instanceof LongConsumer) {
            return (LongConsumer) sink;
        }
        if (Tripwire.ENABLED) {
            Tripwire.trip(AbstractPipeline.class, "using LongStream.adapt(Sink<Long> s)");
        }
        Objects.requireNonNull(sink);
        return new LongPipeline$$ExternalSyntheticLambda10(sink);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static /* synthetic */ long[] lambda$average$1() {
        return new long[2];
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static /* synthetic */ void lambda$average$2(long[] jArr, long j10) {
        jArr[0] = jArr[0] + 1;
        jArr[1] = jArr[1] + j10;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static /* synthetic */ void lambda$average$3(long[] jArr, long[] jArr2) {
        jArr[0] = jArr[0] + jArr2[0];
        jArr[1] = jArr[1] + jArr2[1];
    }

    /*  JADX ERROR: NullPointerException in pass: MarkMethodsForInline
        java.lang.NullPointerException
        */
    /* JADX INFO: Access modifiers changed from: package-private */
    public static /* synthetic */ java.lang.Object lambda$collect$4(java.util.function.BiConsumer r0, java.lang.Object r1, java.lang.Object r2) {
        /*
            r0.accept(r1, r2)
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: j$.util.stream.LongPipeline.lambda$collect$4(java.util.function.BiConsumer, java.lang.Object, java.lang.Object):java.lang.Object");
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static /* synthetic */ Long[] lambda$toArray$5(int i10) {
        return new Long[i10];
    }

    private Stream mapToObj(final LongFunction longFunction, int i10) {
        return new ReferencePipeline.StatelessOp(this, StreamShape.LONG_VALUE, i10) { // from class: j$.util.stream.LongPipeline.1
            /* JADX INFO: Access modifiers changed from: package-private */
            @Override // j$.util.stream.AbstractPipeline
            public Sink opWrapSink(int i11, Sink sink) {
                return new Sink.ChainedLong(sink) { // from class: j$.util.stream.LongPipeline.1.1
                    @Override // j$.util.stream.Sink.OfLong, j$.util.stream.Sink
                    public void accept(long j10) {
                        this.downstream.accept((Sink) longFunction.apply(j10));
                    }
                };
            }
        };
    }

    @Override // j$.util.stream.LongStream
    public final boolean allMatch(LongPredicate longPredicate) {
        return ((Boolean) evaluate(MatchOps.makeLong(longPredicate, MatchOps.MatchKind.ALL))).booleanValue();
    }

    @Override // j$.util.stream.LongStream
    public final boolean anyMatch(LongPredicate longPredicate) {
        return ((Boolean) evaluate(MatchOps.makeLong(longPredicate, MatchOps.MatchKind.ANY))).booleanValue();
    }

    @Override // j$.util.stream.LongStream
    public final DoubleStream asDoubleStream() {
        return new DoublePipeline.StatelessOp(this, StreamShape.LONG_VALUE, StreamOpFlag.NOT_DISTINCT) { // from class: j$.util.stream.LongPipeline.2
            /* JADX INFO: Access modifiers changed from: package-private */
            @Override // j$.util.stream.AbstractPipeline
            public Sink opWrapSink(int i10, Sink sink) {
                return new Sink.ChainedLong(sink) { // from class: j$.util.stream.LongPipeline.2.1
                    @Override // j$.util.stream.Sink.OfLong, j$.util.stream.Sink
                    public void accept(long j10) {
                        this.downstream.accept(j10);
                    }
                };
            }
        };
    }

    @Override // j$.util.stream.LongStream
    public final OptionalDouble average() {
        long j10 = ((long[]) collect(new Supplier() { // from class: j$.util.stream.LongPipeline$$ExternalSyntheticLambda3
            @Override // java.util.function.Supplier
            public final Object get() {
                return LongPipeline.lambda$average$1();
            }
        }, new ObjLongConsumer() { // from class: j$.util.stream.LongPipeline$$ExternalSyntheticLambda4
            @Override // java.util.function.ObjLongConsumer
            public final void accept(Object obj, long j11) {
                LongPipeline.lambda$average$2((long[]) obj, j11);
            }
        }, new BiConsumer() { // from class: j$.util.stream.LongPipeline$$ExternalSyntheticLambda5
            @Override // java.util.function.BiConsumer
            public final void accept(Object obj, Object obj2) {
                LongPipeline.lambda$average$3((long[]) obj, (long[]) obj2);
            }

            public /* synthetic */ BiConsumer andThen(BiConsumer biConsumer) {
                return BiConsumer$CC.$default$andThen(this, biConsumer);
            }
        }))[0];
        return j10 > 0 ? OptionalDouble.of(r0[1] / j10) : OptionalDouble.empty();
    }

    @Override // j$.util.stream.LongStream
    public final Stream boxed() {
        return mapToObj(new LongFunction() { // from class: j$.util.stream.LongPipeline$$ExternalSyntheticLambda1
            @Override // java.util.function.LongFunction
            public final Object apply(long j10) {
                return Long.valueOf(j10);
            }
        }, 0);
    }

    @Override // j$.util.stream.LongStream
    public final Object collect(Supplier supplier, ObjLongConsumer objLongConsumer, final BiConsumer biConsumer) {
        Objects.requireNonNull(biConsumer);
        return evaluate(ReduceOps.makeLong(supplier, objLongConsumer, new BinaryOperator() { // from class: j$.util.stream.LongPipeline$$ExternalSyntheticLambda12
            public /* synthetic */ BiFunction andThen(Function function) {
                return BiFunction$CC.$default$andThen(this, function);
            }

            /*  JADX ERROR: JadxRuntimeException in pass: InlineMethods
                jadx.core.utils.exceptions.JadxRuntimeException: Failed to process method for inline: j$.util.stream.LongPipeline.lambda$collect$4(java.util.function.BiConsumer, java.lang.Object, java.lang.Object):java.lang.Object
                	at jadx.core.dex.visitors.InlineMethods.processInvokeInsn(InlineMethods.java:74)
                	at jadx.core.dex.visitors.InlineMethods.visit(InlineMethods.java:49)
                Caused by: java.lang.NullPointerException
                */
            @Override // java.util.function.BiFunction
            public final java.lang.Object apply(java.lang.Object r2, java.lang.Object r3) {
                /*
                    r1 = this;
                    java.util.function.BiConsumer r0 = java.util.function.BiConsumer.this
                    java.lang.Object r2 = j$.util.stream.LongPipeline.lambda$collect$4(r0, r2, r3)
                    return r2
                */
                throw new UnsupportedOperationException("Method not decompiled: j$.util.stream.LongPipeline$$ExternalSyntheticLambda12.apply(java.lang.Object, java.lang.Object):java.lang.Object");
            }
        }));
    }

    @Override // j$.util.stream.LongStream
    public final long count() {
        return ((Long) evaluate(ReduceOps.makeLongCounting())).longValue();
    }

    @Override // j$.util.stream.LongStream
    public final LongStream distinct() {
        return boxed().distinct().mapToLong(new ToLongFunction() { // from class: j$.util.stream.LongPipeline$$ExternalSyntheticLambda11
            @Override // java.util.function.ToLongFunction
            public final long applyAsLong(Object obj) {
                long longValue;
                longValue = ((Long) obj).longValue();
                return longValue;
            }
        });
    }

    @Override // j$.util.stream.AbstractPipeline
    final Node evaluateToNode(PipelineHelper pipelineHelper, Spliterator spliterator, boolean z10, IntFunction intFunction) {
        return Nodes.collectLong(pipelineHelper, spliterator, z10);
    }

    @Override // j$.util.stream.LongStream
    public final LongStream filter(LongPredicate longPredicate) {
        Objects.requireNonNull(longPredicate);
        return new StatelessOp(this, StreamShape.LONG_VALUE, StreamOpFlag.NOT_SIZED, longPredicate) { // from class: j$.util.stream.LongPipeline.8
            /* JADX INFO: Access modifiers changed from: package-private */
            @Override // j$.util.stream.AbstractPipeline
            public Sink opWrapSink(int i10, Sink sink) {
                return new Sink.ChainedLong(sink) { // from class: j$.util.stream.LongPipeline.8.1
                    @Override // j$.util.stream.Sink.OfLong, j$.util.stream.Sink
                    public void accept(long j10) {
                        getClass();
                        throw null;
                    }

                    @Override // j$.util.stream.Sink.ChainedLong, j$.util.stream.Sink
                    public void begin(long j10) {
                        this.downstream.begin(-1L);
                    }
                };
            }
        };
    }

    @Override // j$.util.stream.LongStream
    public final OptionalLong findAny() {
        return (OptionalLong) evaluate(FindOps.makeLong(false));
    }

    @Override // j$.util.stream.LongStream
    public final OptionalLong findFirst() {
        return (OptionalLong) evaluate(FindOps.makeLong(true));
    }

    @Override // j$.util.stream.LongStream
    public final LongStream flatMap(final LongFunction longFunction) {
        Objects.requireNonNull(longFunction);
        return new StatelessOp(this, StreamShape.LONG_VALUE, StreamOpFlag.NOT_SORTED | StreamOpFlag.NOT_DISTINCT | StreamOpFlag.NOT_SIZED) { // from class: j$.util.stream.LongPipeline.6
            /* JADX INFO: Access modifiers changed from: package-private */
            @Override // j$.util.stream.AbstractPipeline
            public Sink opWrapSink(int i10, Sink sink) {
                return new Sink.ChainedLong(sink) { // from class: j$.util.stream.LongPipeline.6.1
                    boolean cancellationRequestedCalled;
                    LongConsumer downstreamAsLong;

                    {
                        Sink sink2 = this.downstream;
                        Objects.requireNonNull(sink2);
                        this.downstreamAsLong = new LongPipeline$$ExternalSyntheticLambda10(sink2);
                    }

                    @Override // j$.util.stream.Sink.OfLong, j$.util.stream.Sink
                    public void accept(long j10) {
                        LongStream longStream = (LongStream) longFunction.apply(j10);
                        if (longStream != null) {
                            try {
                                if (this.cancellationRequestedCalled) {
                                    Spliterator.OfLong spliterator = longStream.sequential().spliterator();
                                    while (!this.downstream.cancellationRequested() && spliterator.tryAdvance(this.downstreamAsLong)) {
                                    }
                                } else {
                                    longStream.sequential().forEach(this.downstreamAsLong);
                                }
                            } catch (Throwable th) {
                                try {
                                    longStream.close();
                                } catch (Throwable th2) {
                                    th.addSuppressed(th2);
                                }
                                throw th;
                            }
                        }
                        if (longStream != null) {
                            longStream.close();
                        }
                    }

                    @Override // j$.util.stream.Sink.ChainedLong, j$.util.stream.Sink
                    public void begin(long j10) {
                        this.downstream.begin(-1L);
                    }

                    @Override // j$.util.stream.Sink.ChainedLong, j$.util.stream.Sink
                    public boolean cancellationRequested() {
                        this.cancellationRequestedCalled = true;
                        return this.downstream.cancellationRequested();
                    }
                };
            }
        };
    }

    @Override // j$.util.stream.LongStream
    public void forEach(LongConsumer longConsumer) {
        evaluate(ForEachOps.makeLong(longConsumer, false));
    }

    @Override // j$.util.stream.LongStream
    public void forEachOrdered(LongConsumer longConsumer) {
        evaluate(ForEachOps.makeLong(longConsumer, true));
    }

    @Override // j$.util.stream.AbstractPipeline
    final boolean forEachWithCancel(Spliterator spliterator, Sink sink) {
        boolean cancellationRequested;
        Spliterator.OfLong adapt = adapt(spliterator);
        LongConsumer adapt2 = adapt(sink);
        do {
            cancellationRequested = sink.cancellationRequested();
            if (cancellationRequested) {
                break;
            }
        } while (adapt.tryAdvance(adapt2));
        return cancellationRequested;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // j$.util.stream.AbstractPipeline
    public final StreamShape getOutputShape() {
        return StreamShape.LONG_VALUE;
    }

    @Override // j$.util.stream.BaseStream
    public final PrimitiveIterator.OfLong iterator() {
        return Spliterators.iterator(spliterator());
    }

    @Override // j$.util.stream.AbstractPipeline
    final Spliterator.OfLong lazySpliterator(Supplier supplier) {
        return new StreamSpliterators$DelegatingSpliterator.OfLong(supplier);
    }

    @Override // j$.util.stream.LongStream
    public final LongStream limit(long j10) {
        if (j10 >= 0) {
            return SliceOps.makeLong(this, 0L, j10);
        }
        throw new IllegalArgumentException(Long.toString(j10));
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // j$.util.stream.AbstractPipeline, j$.util.stream.PipelineHelper
    public final Node.Builder makeNodeBuilder(long j10, IntFunction intFunction) {
        return Nodes.longBuilder(j10);
    }

    @Override // j$.util.stream.LongStream
    public final LongStream map(LongUnaryOperator longUnaryOperator) {
        Objects.requireNonNull(longUnaryOperator);
        return new StatelessOp(this, StreamShape.LONG_VALUE, StreamOpFlag.NOT_SORTED | StreamOpFlag.NOT_DISTINCT, longUnaryOperator) { // from class: j$.util.stream.LongPipeline.3
            /* JADX INFO: Access modifiers changed from: package-private */
            @Override // j$.util.stream.AbstractPipeline
            public Sink opWrapSink(int i10, Sink sink) {
                return new Sink.ChainedLong(sink) { // from class: j$.util.stream.LongPipeline.3.1
                    @Override // j$.util.stream.Sink.OfLong, j$.util.stream.Sink
                    public void accept(long j10) {
                        getClass();
                        throw null;
                    }
                };
            }
        };
    }

    @Override // j$.util.stream.LongStream
    public final DoubleStream mapToDouble(LongToDoubleFunction longToDoubleFunction) {
        Objects.requireNonNull(longToDoubleFunction);
        return new DoublePipeline.StatelessOp(this, StreamShape.LONG_VALUE, StreamOpFlag.NOT_SORTED | StreamOpFlag.NOT_DISTINCT, longToDoubleFunction) { // from class: j$.util.stream.LongPipeline.5
            /* JADX INFO: Access modifiers changed from: package-private */
            @Override // j$.util.stream.AbstractPipeline
            public Sink opWrapSink(int i10, Sink sink) {
                return new Sink.ChainedLong(sink) { // from class: j$.util.stream.LongPipeline.5.1
                    @Override // j$.util.stream.Sink.OfLong, j$.util.stream.Sink
                    public void accept(long j10) {
                        getClass();
                        throw null;
                    }
                };
            }
        };
    }

    @Override // j$.util.stream.LongStream
    public final IntStream mapToInt(LongToIntFunction longToIntFunction) {
        Objects.requireNonNull(longToIntFunction);
        return new IntPipeline.StatelessOp(this, StreamShape.LONG_VALUE, StreamOpFlag.NOT_SORTED | StreamOpFlag.NOT_DISTINCT, longToIntFunction) { // from class: j$.util.stream.LongPipeline.4
            /* JADX INFO: Access modifiers changed from: package-private */
            @Override // j$.util.stream.AbstractPipeline
            public Sink opWrapSink(int i10, Sink sink) {
                return new Sink.ChainedLong(sink) { // from class: j$.util.stream.LongPipeline.4.1
                    @Override // j$.util.stream.Sink.OfLong, j$.util.stream.Sink
                    public void accept(long j10) {
                        getClass();
                        throw null;
                    }
                };
            }
        };
    }

    @Override // j$.util.stream.LongStream
    public final Stream mapToObj(LongFunction longFunction) {
        Objects.requireNonNull(longFunction);
        return mapToObj(longFunction, StreamOpFlag.NOT_SORTED | StreamOpFlag.NOT_DISTINCT);
    }

    @Override // j$.util.stream.LongStream
    public final OptionalLong max() {
        return reduce(new LongBinaryOperator() { // from class: j$.util.stream.LongPipeline$$ExternalSyntheticLambda0
            @Override // java.util.function.LongBinaryOperator
            public final long applyAsLong(long j10, long j11) {
                return Math.max(j10, j11);
            }
        });
    }

    @Override // j$.util.stream.LongStream
    public final OptionalLong min() {
        return reduce(new LongBinaryOperator() { // from class: j$.util.stream.LongPipeline$$ExternalSyntheticLambda9
            @Override // java.util.function.LongBinaryOperator
            public final long applyAsLong(long j10, long j11) {
                return Math.min(j10, j11);
            }
        });
    }

    @Override // j$.util.stream.LongStream
    public final boolean noneMatch(LongPredicate longPredicate) {
        return ((Boolean) evaluate(MatchOps.makeLong(longPredicate, MatchOps.MatchKind.NONE))).booleanValue();
    }

    @Override // j$.util.stream.LongStream
    public final LongStream peek(final LongConsumer longConsumer) {
        Objects.requireNonNull(longConsumer);
        return new StatelessOp(this, StreamShape.LONG_VALUE, 0) { // from class: j$.util.stream.LongPipeline.9
            /* JADX INFO: Access modifiers changed from: package-private */
            @Override // j$.util.stream.AbstractPipeline
            public Sink opWrapSink(int i10, Sink sink) {
                return new Sink.ChainedLong(sink) { // from class: j$.util.stream.LongPipeline.9.1
                    @Override // j$.util.stream.Sink.OfLong, j$.util.stream.Sink
                    public void accept(long j10) {
                        longConsumer.accept(j10);
                        this.downstream.accept(j10);
                    }
                };
            }
        };
    }

    @Override // j$.util.stream.LongStream
    public final long reduce(long j10, LongBinaryOperator longBinaryOperator) {
        return ((Long) evaluate(ReduceOps.makeLong(j10, longBinaryOperator))).longValue();
    }

    @Override // j$.util.stream.LongStream
    public final OptionalLong reduce(LongBinaryOperator longBinaryOperator) {
        return (OptionalLong) evaluate(ReduceOps.makeLong(longBinaryOperator));
    }

    @Override // j$.util.stream.LongStream
    public final LongStream skip(long j10) {
        if (j10 >= 0) {
            return j10 == 0 ? this : SliceOps.makeLong(this, j10, -1L);
        }
        throw new IllegalArgumentException(Long.toString(j10));
    }

    @Override // j$.util.stream.LongStream
    public final LongStream sorted() {
        return SortedOps.makeLong(this);
    }

    @Override // j$.util.stream.AbstractPipeline, j$.util.stream.BaseStream
    public final Spliterator.OfLong spliterator() {
        return adapt(super.spliterator());
    }

    @Override // j$.util.stream.LongStream
    public final long sum() {
        return reduce(0L, new LongBinaryOperator() { // from class: j$.util.stream.LongPipeline$$ExternalSyntheticLambda6
            @Override // java.util.function.LongBinaryOperator
            public final long applyAsLong(long j10, long j11) {
                return j10 + j11;
            }
        });
    }

    @Override // j$.util.stream.LongStream
    public final LongSummaryStatistics summaryStatistics() {
        return (LongSummaryStatistics) collect(new Supplier() { // from class: j$.util.stream.Collectors$$ExternalSyntheticLambda5
            @Override // java.util.function.Supplier
            public final Object get() {
                return new LongSummaryStatistics();
            }
        }, new ObjLongConsumer() { // from class: j$.util.stream.LongPipeline$$ExternalSyntheticLambda7
            @Override // java.util.function.ObjLongConsumer
            public final void accept(Object obj, long j10) {
                ((LongSummaryStatistics) obj).accept(j10);
            }
        }, new BiConsumer() { // from class: j$.util.stream.LongPipeline$$ExternalSyntheticLambda8
            @Override // java.util.function.BiConsumer
            public final void accept(Object obj, Object obj2) {
                ((LongSummaryStatistics) obj).combine((LongSummaryStatistics) obj2);
            }

            public /* synthetic */ BiConsumer andThen(BiConsumer biConsumer) {
                return BiConsumer$CC.$default$andThen(this, biConsumer);
            }
        });
    }

    @Override // j$.util.stream.LongStream
    public final long[] toArray() {
        return (long[]) Nodes.flattenLong((Node.OfLong) evaluateToArrayNode(new IntFunction() { // from class: j$.util.stream.LongPipeline$$ExternalSyntheticLambda2
            @Override // java.util.function.IntFunction
            public final Object apply(int i10) {
                return LongPipeline.lambda$toArray$5(i10);
            }
        })).asPrimitiveArray();
    }

    @Override // j$.util.stream.BaseStream
    public LongStream unordered() {
        return !isOrdered() ? this : new StatelessOp(this, StreamShape.LONG_VALUE, StreamOpFlag.NOT_ORDERED) { // from class: j$.util.stream.LongPipeline.7
            /* JADX INFO: Access modifiers changed from: package-private */
            @Override // j$.util.stream.AbstractPipeline
            public Sink opWrapSink(int i10, Sink sink) {
                return sink;
            }
        };
    }

    @Override // j$.util.stream.AbstractPipeline
    final Spliterator wrap(PipelineHelper pipelineHelper, Supplier supplier, boolean z10) {
        return new StreamSpliterators$LongWrappingSpliterator(pipelineHelper, supplier, z10);
    }
}
