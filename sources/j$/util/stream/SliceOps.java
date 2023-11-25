package j$.util.stream;

import j$.util.Spliterator;
import j$.util.stream.DoublePipeline;
import j$.util.stream.IntPipeline;
import j$.util.stream.LongPipeline;
import j$.util.stream.Node;
import j$.util.stream.ReferencePipeline;
import j$.util.stream.Sink;
import j$.util.stream.SliceOps;
import j$.util.stream.StreamSpliterators$SliceSpliterator;
import j$.util.stream.StreamSpliterators$UnorderedSliceSpliterator;
import java.util.function.IntFunction;
import okhttp3.internal.http2.Http2;

/* loaded from: classes2.dex */
abstract class SliceOps {

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: j$.util.stream.SliceOps$2  reason: invalid class name */
    /* loaded from: classes2.dex */
    public class AnonymousClass2 extends IntPipeline.StatefulOp {
        final /* synthetic */ long val$limit;
        final /* synthetic */ long val$skip;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        AnonymousClass2(AbstractPipeline abstractPipeline, StreamShape streamShape, int i10, long j10, long j11) {
            super(abstractPipeline, streamShape, i10);
            this.val$skip = j10;
            this.val$limit = j11;
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        public static /* synthetic */ Integer[] lambda$opEvaluateParallelLazy$0(int i10) {
            return new Integer[i10];
        }

        @Override // j$.util.stream.AbstractPipeline
        Node opEvaluateParallel(PipelineHelper pipelineHelper, Spliterator spliterator, IntFunction intFunction) {
            long exactOutputSizeIfKnown = pipelineHelper.exactOutputSizeIfKnown(spliterator);
            if (exactOutputSizeIfKnown > 0 && spliterator.hasCharacteristics(Http2.INITIAL_MAX_FRAME_SIZE)) {
                return Nodes.collectInt(pipelineHelper, SliceOps.sliceSpliterator(pipelineHelper.getSourceShape(), spliterator, this.val$skip, this.val$limit), true);
            }
            return !StreamOpFlag.ORDERED.isKnown(pipelineHelper.getStreamAndOpFlags()) ? Nodes.collectInt(this, unorderedSkipLimitSpliterator((Spliterator.OfInt) pipelineHelper.wrapSpliterator(spliterator), this.val$skip, this.val$limit, exactOutputSizeIfKnown), true) : (Node) new SliceTask(this, pipelineHelper, spliterator, intFunction, this.val$skip, this.val$limit).invoke();
        }

        @Override // j$.util.stream.AbstractPipeline
        Spliterator opEvaluateParallelLazy(PipelineHelper pipelineHelper, Spliterator spliterator) {
            long exactOutputSizeIfKnown = pipelineHelper.exactOutputSizeIfKnown(spliterator);
            if (exactOutputSizeIfKnown > 0 && spliterator.hasCharacteristics(Http2.INITIAL_MAX_FRAME_SIZE)) {
                Spliterator.OfInt ofInt = (Spliterator.OfInt) pipelineHelper.wrapSpliterator(spliterator);
                long j10 = this.val$skip;
                return new StreamSpliterators$SliceSpliterator.OfInt(ofInt, j10, SliceOps.calcSliceFence(j10, this.val$limit));
            }
            return !StreamOpFlag.ORDERED.isKnown(pipelineHelper.getStreamAndOpFlags()) ? unorderedSkipLimitSpliterator((Spliterator.OfInt) pipelineHelper.wrapSpliterator(spliterator), this.val$skip, this.val$limit, exactOutputSizeIfKnown) : ((Node) new SliceTask(this, pipelineHelper, spliterator, new IntFunction() { // from class: j$.util.stream.SliceOps$2$$ExternalSyntheticLambda0
                @Override // java.util.function.IntFunction
                public final Object apply(int i10) {
                    return SliceOps.AnonymousClass2.lambda$opEvaluateParallelLazy$0(i10);
                }
            }, this.val$skip, this.val$limit).invoke()).spliterator();
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        @Override // j$.util.stream.AbstractPipeline
        public Sink opWrapSink(int i10, Sink sink) {
            return new Sink.ChainedInt(sink) { // from class: j$.util.stream.SliceOps.2.1

                /* renamed from: m  reason: collision with root package name */
                long f18476m;

                /* renamed from: n  reason: collision with root package name */
                long f18477n;

                {
                    this.f18477n = AnonymousClass2.this.val$skip;
                    long j10 = AnonymousClass2.this.val$limit;
                    this.f18476m = j10 < 0 ? Long.MAX_VALUE : j10;
                }

                @Override // j$.util.stream.Sink.OfInt, j$.util.stream.Sink
                public void accept(int i11) {
                    long j10 = this.f18477n;
                    if (j10 != 0) {
                        this.f18477n = j10 - 1;
                        return;
                    }
                    long j11 = this.f18476m;
                    if (j11 > 0) {
                        this.f18476m = j11 - 1;
                        this.downstream.accept(i11);
                    }
                }

                @Override // j$.util.stream.Sink.ChainedInt, j$.util.stream.Sink
                public void begin(long j10) {
                    this.downstream.begin(SliceOps.calcSize(j10, AnonymousClass2.this.val$skip, this.f18476m));
                }

                @Override // j$.util.stream.Sink.ChainedInt, j$.util.stream.Sink
                public boolean cancellationRequested() {
                    return this.f18476m == 0 || this.downstream.cancellationRequested();
                }
            };
        }

        Spliterator.OfInt unorderedSkipLimitSpliterator(Spliterator.OfInt ofInt, long j10, long j11, long j12) {
            long j13;
            long j14;
            if (j10 <= j12) {
                long j15 = j12 - j10;
                j14 = j11 >= 0 ? Math.min(j11, j15) : j15;
                j13 = 0;
            } else {
                j13 = j10;
                j14 = j11;
            }
            return new StreamSpliterators$UnorderedSliceSpliterator.OfInt(ofInt, j13, j14);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: j$.util.stream.SliceOps$3  reason: invalid class name */
    /* loaded from: classes2.dex */
    public class AnonymousClass3 extends LongPipeline.StatefulOp {
        final /* synthetic */ long val$limit;
        final /* synthetic */ long val$skip;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        AnonymousClass3(AbstractPipeline abstractPipeline, StreamShape streamShape, int i10, long j10, long j11) {
            super(abstractPipeline, streamShape, i10);
            this.val$skip = j10;
            this.val$limit = j11;
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        public static /* synthetic */ Long[] lambda$opEvaluateParallelLazy$0(int i10) {
            return new Long[i10];
        }

        @Override // j$.util.stream.AbstractPipeline
        Node opEvaluateParallel(PipelineHelper pipelineHelper, Spliterator spliterator, IntFunction intFunction) {
            long exactOutputSizeIfKnown = pipelineHelper.exactOutputSizeIfKnown(spliterator);
            if (exactOutputSizeIfKnown > 0 && spliterator.hasCharacteristics(Http2.INITIAL_MAX_FRAME_SIZE)) {
                return Nodes.collectLong(pipelineHelper, SliceOps.sliceSpliterator(pipelineHelper.getSourceShape(), spliterator, this.val$skip, this.val$limit), true);
            }
            return !StreamOpFlag.ORDERED.isKnown(pipelineHelper.getStreamAndOpFlags()) ? Nodes.collectLong(this, unorderedSkipLimitSpliterator((Spliterator.OfLong) pipelineHelper.wrapSpliterator(spliterator), this.val$skip, this.val$limit, exactOutputSizeIfKnown), true) : (Node) new SliceTask(this, pipelineHelper, spliterator, intFunction, this.val$skip, this.val$limit).invoke();
        }

        @Override // j$.util.stream.AbstractPipeline
        Spliterator opEvaluateParallelLazy(PipelineHelper pipelineHelper, Spliterator spliterator) {
            long exactOutputSizeIfKnown = pipelineHelper.exactOutputSizeIfKnown(spliterator);
            if (exactOutputSizeIfKnown > 0 && spliterator.hasCharacteristics(Http2.INITIAL_MAX_FRAME_SIZE)) {
                Spliterator.OfLong ofLong = (Spliterator.OfLong) pipelineHelper.wrapSpliterator(spliterator);
                long j10 = this.val$skip;
                return new StreamSpliterators$SliceSpliterator.OfLong(ofLong, j10, SliceOps.calcSliceFence(j10, this.val$limit));
            }
            return !StreamOpFlag.ORDERED.isKnown(pipelineHelper.getStreamAndOpFlags()) ? unorderedSkipLimitSpliterator((Spliterator.OfLong) pipelineHelper.wrapSpliterator(spliterator), this.val$skip, this.val$limit, exactOutputSizeIfKnown) : ((Node) new SliceTask(this, pipelineHelper, spliterator, new IntFunction() { // from class: j$.util.stream.SliceOps$3$$ExternalSyntheticLambda0
                @Override // java.util.function.IntFunction
                public final Object apply(int i10) {
                    return SliceOps.AnonymousClass3.lambda$opEvaluateParallelLazy$0(i10);
                }
            }, this.val$skip, this.val$limit).invoke()).spliterator();
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        @Override // j$.util.stream.AbstractPipeline
        public Sink opWrapSink(int i10, Sink sink) {
            return new Sink.ChainedLong(sink) { // from class: j$.util.stream.SliceOps.3.1

                /* renamed from: m  reason: collision with root package name */
                long f18478m;

                /* renamed from: n  reason: collision with root package name */
                long f18479n;

                {
                    this.f18479n = AnonymousClass3.this.val$skip;
                    long j10 = AnonymousClass3.this.val$limit;
                    this.f18478m = j10 < 0 ? Long.MAX_VALUE : j10;
                }

                @Override // j$.util.stream.Sink.OfLong, j$.util.stream.Sink
                public void accept(long j10) {
                    long j11 = this.f18479n;
                    if (j11 != 0) {
                        this.f18479n = j11 - 1;
                        return;
                    }
                    long j12 = this.f18478m;
                    if (j12 > 0) {
                        this.f18478m = j12 - 1;
                        this.downstream.accept(j10);
                    }
                }

                @Override // j$.util.stream.Sink.ChainedLong, j$.util.stream.Sink
                public void begin(long j10) {
                    this.downstream.begin(SliceOps.calcSize(j10, AnonymousClass3.this.val$skip, this.f18478m));
                }

                @Override // j$.util.stream.Sink.ChainedLong, j$.util.stream.Sink
                public boolean cancellationRequested() {
                    return this.f18478m == 0 || this.downstream.cancellationRequested();
                }
            };
        }

        Spliterator.OfLong unorderedSkipLimitSpliterator(Spliterator.OfLong ofLong, long j10, long j11, long j12) {
            long j13;
            long j14;
            if (j10 <= j12) {
                long j15 = j12 - j10;
                j14 = j11 >= 0 ? Math.min(j11, j15) : j15;
                j13 = 0;
            } else {
                j13 = j10;
                j14 = j11;
            }
            return new StreamSpliterators$UnorderedSliceSpliterator.OfLong(ofLong, j13, j14);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: j$.util.stream.SliceOps$4  reason: invalid class name */
    /* loaded from: classes2.dex */
    public class AnonymousClass4 extends DoublePipeline.StatefulOp {
        final /* synthetic */ long val$limit;
        final /* synthetic */ long val$skip;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        AnonymousClass4(AbstractPipeline abstractPipeline, StreamShape streamShape, int i10, long j10, long j11) {
            super(abstractPipeline, streamShape, i10);
            this.val$skip = j10;
            this.val$limit = j11;
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        public static /* synthetic */ Double[] lambda$opEvaluateParallelLazy$0(int i10) {
            return new Double[i10];
        }

        @Override // j$.util.stream.AbstractPipeline
        Node opEvaluateParallel(PipelineHelper pipelineHelper, Spliterator spliterator, IntFunction intFunction) {
            long exactOutputSizeIfKnown = pipelineHelper.exactOutputSizeIfKnown(spliterator);
            if (exactOutputSizeIfKnown > 0 && spliterator.hasCharacteristics(Http2.INITIAL_MAX_FRAME_SIZE)) {
                return Nodes.collectDouble(pipelineHelper, SliceOps.sliceSpliterator(pipelineHelper.getSourceShape(), spliterator, this.val$skip, this.val$limit), true);
            }
            return !StreamOpFlag.ORDERED.isKnown(pipelineHelper.getStreamAndOpFlags()) ? Nodes.collectDouble(this, unorderedSkipLimitSpliterator((Spliterator.OfDouble) pipelineHelper.wrapSpliterator(spliterator), this.val$skip, this.val$limit, exactOutputSizeIfKnown), true) : (Node) new SliceTask(this, pipelineHelper, spliterator, intFunction, this.val$skip, this.val$limit).invoke();
        }

        @Override // j$.util.stream.AbstractPipeline
        Spliterator opEvaluateParallelLazy(PipelineHelper pipelineHelper, Spliterator spliterator) {
            long exactOutputSizeIfKnown = pipelineHelper.exactOutputSizeIfKnown(spliterator);
            if (exactOutputSizeIfKnown > 0 && spliterator.hasCharacteristics(Http2.INITIAL_MAX_FRAME_SIZE)) {
                Spliterator.OfDouble ofDouble = (Spliterator.OfDouble) pipelineHelper.wrapSpliterator(spliterator);
                long j10 = this.val$skip;
                return new StreamSpliterators$SliceSpliterator.OfDouble(ofDouble, j10, SliceOps.calcSliceFence(j10, this.val$limit));
            }
            return !StreamOpFlag.ORDERED.isKnown(pipelineHelper.getStreamAndOpFlags()) ? unorderedSkipLimitSpliterator((Spliterator.OfDouble) pipelineHelper.wrapSpliterator(spliterator), this.val$skip, this.val$limit, exactOutputSizeIfKnown) : ((Node) new SliceTask(this, pipelineHelper, spliterator, new IntFunction() { // from class: j$.util.stream.SliceOps$4$$ExternalSyntheticLambda0
                @Override // java.util.function.IntFunction
                public final Object apply(int i10) {
                    return SliceOps.AnonymousClass4.lambda$opEvaluateParallelLazy$0(i10);
                }
            }, this.val$skip, this.val$limit).invoke()).spliterator();
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        @Override // j$.util.stream.AbstractPipeline
        public Sink opWrapSink(int i10, Sink sink) {
            return new Sink.ChainedDouble(sink) { // from class: j$.util.stream.SliceOps.4.1

                /* renamed from: m  reason: collision with root package name */
                long f18480m;

                /* renamed from: n  reason: collision with root package name */
                long f18481n;

                {
                    this.f18481n = AnonymousClass4.this.val$skip;
                    long j10 = AnonymousClass4.this.val$limit;
                    this.f18480m = j10 < 0 ? Long.MAX_VALUE : j10;
                }

                @Override // j$.util.stream.Sink.OfDouble, j$.util.stream.Sink, java.util.function.DoubleConsumer
                public void accept(double d10) {
                    long j10 = this.f18481n;
                    if (j10 != 0) {
                        this.f18481n = j10 - 1;
                        return;
                    }
                    long j11 = this.f18480m;
                    if (j11 > 0) {
                        this.f18480m = j11 - 1;
                        this.downstream.accept(d10);
                    }
                }

                @Override // j$.util.stream.Sink.ChainedDouble, j$.util.stream.Sink
                public void begin(long j10) {
                    this.downstream.begin(SliceOps.calcSize(j10, AnonymousClass4.this.val$skip, this.f18480m));
                }

                @Override // j$.util.stream.Sink.ChainedDouble, j$.util.stream.Sink
                public boolean cancellationRequested() {
                    return this.f18480m == 0 || this.downstream.cancellationRequested();
                }
            };
        }

        Spliterator.OfDouble unorderedSkipLimitSpliterator(Spliterator.OfDouble ofDouble, long j10, long j11, long j12) {
            long j13;
            long j14;
            if (j10 <= j12) {
                long j15 = j12 - j10;
                j14 = j11 >= 0 ? Math.min(j11, j15) : j15;
                j13 = 0;
            } else {
                j13 = j10;
                j14 = j11;
            }
            return new StreamSpliterators$UnorderedSliceSpliterator.OfDouble(ofDouble, j13, j14);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: j$.util.stream.SliceOps$5  reason: invalid class name */
    /* loaded from: classes2.dex */
    public static /* synthetic */ class AnonymousClass5 {
        static final /* synthetic */ int[] $SwitchMap$java$util$stream$StreamShape;

        static {
            int[] iArr = new int[StreamShape.values().length];
            $SwitchMap$java$util$stream$StreamShape = iArr;
            try {
                iArr[StreamShape.REFERENCE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                $SwitchMap$java$util$stream$StreamShape[StreamShape.INT_VALUE.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                $SwitchMap$java$util$stream$StreamShape[StreamShape.LONG_VALUE.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                $SwitchMap$java$util$stream$StreamShape[StreamShape.DOUBLE_VALUE.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
        }
    }

    /* loaded from: classes2.dex */
    private static final class SliceTask extends AbstractShortCircuitTask {
        private volatile boolean completed;
        private final IntFunction generator;
        private final AbstractPipeline op;
        private final long targetOffset;
        private final long targetSize;
        private long thisNodeSize;

        SliceTask(AbstractPipeline abstractPipeline, PipelineHelper pipelineHelper, Spliterator spliterator, IntFunction intFunction, long j10, long j11) {
            super(pipelineHelper, spliterator);
            this.op = abstractPipeline;
            this.generator = intFunction;
            this.targetOffset = j10;
            this.targetSize = j11;
        }

        SliceTask(SliceTask sliceTask, Spliterator spliterator) {
            super(sliceTask, spliterator);
            this.op = sliceTask.op;
            this.generator = sliceTask.generator;
            this.targetOffset = sliceTask.targetOffset;
            this.targetSize = sliceTask.targetSize;
        }

        private long completedSize(long j10) {
            if (this.completed) {
                return this.thisNodeSize;
            }
            SliceTask sliceTask = (SliceTask) this.leftChild;
            SliceTask sliceTask2 = (SliceTask) this.rightChild;
            if (sliceTask == null || sliceTask2 == null) {
                return this.thisNodeSize;
            }
            long completedSize = sliceTask.completedSize(j10);
            return completedSize >= j10 ? completedSize : completedSize + sliceTask2.completedSize(j10);
        }

        private Node doTruncate(Node node) {
            return node.truncate(this.targetOffset, this.targetSize >= 0 ? Math.min(node.count(), this.targetOffset + this.targetSize) : this.thisNodeSize, this.generator);
        }

        private boolean isLeftCompleted(long j10) {
            SliceTask sliceTask;
            long completedSize = this.completed ? this.thisNodeSize : completedSize(j10);
            if (completedSize >= j10) {
                return true;
            }
            SliceTask sliceTask2 = this;
            for (SliceTask sliceTask3 = (SliceTask) getParent(); sliceTask3 != null; sliceTask3 = (SliceTask) sliceTask3.getParent()) {
                if (sliceTask2 == sliceTask3.rightChild && (sliceTask = (SliceTask) sliceTask3.leftChild) != null) {
                    completedSize += sliceTask.completedSize(j10);
                    if (completedSize >= j10) {
                        return true;
                    }
                }
                sliceTask2 = sliceTask3;
            }
            return completedSize >= j10;
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // j$.util.stream.AbstractShortCircuitTask
        public void cancel() {
            super.cancel();
            if (this.completed) {
                setLocalResult(getEmptyResult());
            }
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // j$.util.stream.AbstractTask
        public final Node doLeaf() {
            if (isRoot()) {
                Node.Builder makeNodeBuilder = this.op.makeNodeBuilder(StreamOpFlag.SIZED.isPreserved(this.op.sourceOrOpFlags) ? this.op.exactOutputSizeIfKnown(this.spliterator) : -1L, this.generator);
                Sink opWrapSink = this.op.opWrapSink(this.helper.getStreamAndOpFlags(), makeNodeBuilder);
                PipelineHelper pipelineHelper = this.helper;
                pipelineHelper.copyIntoWithCancel(pipelineHelper.wrapSink(opWrapSink), this.spliterator);
                return makeNodeBuilder.build();
            }
            Node.Builder makeNodeBuilder2 = this.op.makeNodeBuilder(-1L, this.generator);
            if (this.targetOffset == 0) {
                Sink opWrapSink2 = this.op.opWrapSink(this.helper.getStreamAndOpFlags(), makeNodeBuilder2);
                PipelineHelper pipelineHelper2 = this.helper;
                pipelineHelper2.copyIntoWithCancel(pipelineHelper2.wrapSink(opWrapSink2), this.spliterator);
            } else {
                this.helper.wrapAndCopyInto(makeNodeBuilder2, this.spliterator);
            }
            Node build = makeNodeBuilder2.build();
            this.thisNodeSize = build.count();
            this.completed = true;
            this.spliterator = null;
            return build;
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // j$.util.stream.AbstractShortCircuitTask
        public final Node getEmptyResult() {
            return Nodes.emptyNode(this.op.getOutputShape());
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // j$.util.stream.AbstractTask
        public SliceTask makeChild(Spliterator spliterator) {
            return new SliceTask(this, spliterator);
        }

        /* JADX WARN: Removed duplicated region for block: B:17:0x0062  */
        @Override // j$.util.stream.AbstractTask, java.util.concurrent.CountedCompleter
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final void onCompletion(java.util.concurrent.CountedCompleter r8) {
            /*
                r7 = this;
                boolean r0 = r7.isLeaf()
                r1 = 0
                if (r0 != 0) goto L6c
                j$.util.stream.AbstractTask r0 = r7.leftChild
                j$.util.stream.SliceOps$SliceTask r0 = (j$.util.stream.SliceOps.SliceTask) r0
                long r3 = r0.thisNodeSize
                j$.util.stream.AbstractTask r0 = r7.rightChild
                j$.util.stream.SliceOps$SliceTask r0 = (j$.util.stream.SliceOps.SliceTask) r0
                long r5 = r0.thisNodeSize
                long r3 = r3 + r5
                r7.thisNodeSize = r3
                boolean r0 = r7.canceled
                if (r0 == 0) goto L22
                r7.thisNodeSize = r1
            L1d:
                j$.util.stream.Node r0 = r7.getEmptyResult()
                goto L5c
            L22:
                long r3 = r7.thisNodeSize
                int r0 = (r3 > r1 ? 1 : (r3 == r1 ? 0 : -1))
                if (r0 != 0) goto L29
                goto L1d
            L29:
                j$.util.stream.AbstractTask r0 = r7.leftChild
                j$.util.stream.SliceOps$SliceTask r0 = (j$.util.stream.SliceOps.SliceTask) r0
                long r3 = r0.thisNodeSize
                int r0 = (r3 > r1 ? 1 : (r3 == r1 ? 0 : -1))
                if (r0 != 0) goto L3e
                j$.util.stream.AbstractTask r0 = r7.rightChild
                j$.util.stream.SliceOps$SliceTask r0 = (j$.util.stream.SliceOps.SliceTask) r0
                java.lang.Object r0 = r0.getLocalResult()
                j$.util.stream.Node r0 = (j$.util.stream.Node) r0
                goto L5c
            L3e:
                j$.util.stream.AbstractPipeline r0 = r7.op
                j$.util.stream.StreamShape r0 = r0.getOutputShape()
                j$.util.stream.AbstractTask r3 = r7.leftChild
                j$.util.stream.SliceOps$SliceTask r3 = (j$.util.stream.SliceOps.SliceTask) r3
                java.lang.Object r3 = r3.getLocalResult()
                j$.util.stream.Node r3 = (j$.util.stream.Node) r3
                j$.util.stream.AbstractTask r4 = r7.rightChild
                j$.util.stream.SliceOps$SliceTask r4 = (j$.util.stream.SliceOps.SliceTask) r4
                java.lang.Object r4 = r4.getLocalResult()
                j$.util.stream.Node r4 = (j$.util.stream.Node) r4
                j$.util.stream.Node r0 = j$.util.stream.Nodes.conc(r0, r3, r4)
            L5c:
                boolean r3 = r7.isRoot()
                if (r3 == 0) goto L66
                j$.util.stream.Node r0 = r7.doTruncate(r0)
            L66:
                r7.setLocalResult(r0)
                r0 = 1
                r7.completed = r0
            L6c:
                long r3 = r7.targetSize
                int r0 = (r3 > r1 ? 1 : (r3 == r1 ? 0 : -1))
                if (r0 < 0) goto L86
                boolean r0 = r7.isRoot()
                if (r0 != 0) goto L86
                long r0 = r7.targetOffset
                long r2 = r7.targetSize
                long r0 = r0 + r2
                boolean r0 = r7.isLeftCompleted(r0)
                if (r0 == 0) goto L86
                r7.cancelLaterNodes()
            L86:
                super.onCompletion(r8)
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: j$.util.stream.SliceOps.SliceTask.onCompletion(java.util.concurrent.CountedCompleter):void");
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static long calcSize(long j10, long j11, long j12) {
        if (j10 >= 0) {
            return Math.max(-1L, Math.min(j10 - j11, j12));
        }
        return -1L;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static long calcSliceFence(long j10, long j11) {
        long j12 = j11 >= 0 ? j10 + j11 : Long.MAX_VALUE;
        if (j12 >= 0) {
            return j12;
        }
        return Long.MAX_VALUE;
    }

    private static int flags(long j10) {
        return (j10 != -1 ? StreamOpFlag.IS_SHORT_CIRCUIT : 0) | StreamOpFlag.NOT_SIZED;
    }

    public static DoubleStream makeDouble(AbstractPipeline abstractPipeline, long j10, long j11) {
        if (j10 >= 0) {
            return new AnonymousClass4(abstractPipeline, StreamShape.DOUBLE_VALUE, flags(j11), j10, j11);
        }
        throw new IllegalArgumentException("Skip must be non-negative: " + j10);
    }

    public static IntStream makeInt(AbstractPipeline abstractPipeline, long j10, long j11) {
        if (j10 >= 0) {
            return new AnonymousClass2(abstractPipeline, StreamShape.INT_VALUE, flags(j11), j10, j11);
        }
        throw new IllegalArgumentException("Skip must be non-negative: " + j10);
    }

    public static LongStream makeLong(AbstractPipeline abstractPipeline, long j10, long j11) {
        if (j10 >= 0) {
            return new AnonymousClass3(abstractPipeline, StreamShape.LONG_VALUE, flags(j11), j10, j11);
        }
        throw new IllegalArgumentException("Skip must be non-negative: " + j10);
    }

    public static Stream makeRef(AbstractPipeline abstractPipeline, final long j10, final long j11) {
        if (j10 >= 0) {
            return new ReferencePipeline.StatefulOp(abstractPipeline, StreamShape.REFERENCE, flags(j11)) { // from class: j$.util.stream.SliceOps.1
                @Override // j$.util.stream.AbstractPipeline
                Node opEvaluateParallel(PipelineHelper pipelineHelper, Spliterator spliterator, IntFunction intFunction) {
                    long exactOutputSizeIfKnown = pipelineHelper.exactOutputSizeIfKnown(spliterator);
                    if (exactOutputSizeIfKnown > 0 && spliterator.hasCharacteristics(Http2.INITIAL_MAX_FRAME_SIZE)) {
                        return Nodes.collect(pipelineHelper, SliceOps.sliceSpliterator(pipelineHelper.getSourceShape(), spliterator, j10, j11), true, intFunction);
                    }
                    return !StreamOpFlag.ORDERED.isKnown(pipelineHelper.getStreamAndOpFlags()) ? Nodes.collect(this, unorderedSkipLimitSpliterator(pipelineHelper.wrapSpliterator(spliterator), j10, j11, exactOutputSizeIfKnown), true, intFunction) : (Node) new SliceTask(this, pipelineHelper, spliterator, intFunction, j10, j11).invoke();
                }

                @Override // j$.util.stream.AbstractPipeline
                Spliterator opEvaluateParallelLazy(PipelineHelper pipelineHelper, Spliterator spliterator) {
                    long exactOutputSizeIfKnown = pipelineHelper.exactOutputSizeIfKnown(spliterator);
                    if (exactOutputSizeIfKnown > 0 && spliterator.hasCharacteristics(Http2.INITIAL_MAX_FRAME_SIZE)) {
                        Spliterator wrapSpliterator = pipelineHelper.wrapSpliterator(spliterator);
                        long j12 = j10;
                        return new StreamSpliterators$SliceSpliterator.OfRef(wrapSpliterator, j12, SliceOps.calcSliceFence(j12, j11));
                    }
                    return !StreamOpFlag.ORDERED.isKnown(pipelineHelper.getStreamAndOpFlags()) ? unorderedSkipLimitSpliterator(pipelineHelper.wrapSpliterator(spliterator), j10, j11, exactOutputSizeIfKnown) : ((Node) new SliceTask(this, pipelineHelper, spliterator, Nodes.castingArray(), j10, j11).invoke()).spliterator();
                }

                /* JADX INFO: Access modifiers changed from: package-private */
                @Override // j$.util.stream.AbstractPipeline
                public Sink opWrapSink(int i10, Sink sink) {
                    return new Sink.ChainedReference(sink) { // from class: j$.util.stream.SliceOps.1.1

                        /* renamed from: m  reason: collision with root package name */
                        long f18474m;

                        /* renamed from: n  reason: collision with root package name */
                        long f18475n;

                        {
                            this.f18475n = j10;
                            long j12 = j11;
                            this.f18474m = j12 < 0 ? Long.MAX_VALUE : j12;
                        }

                        @Override // java.util.function.Consumer
                        public void accept(Object obj) {
                            long j12 = this.f18475n;
                            if (j12 != 0) {
                                this.f18475n = j12 - 1;
                                return;
                            }
                            long j13 = this.f18474m;
                            if (j13 > 0) {
                                this.f18474m = j13 - 1;
                                this.downstream.accept((Sink) obj);
                            }
                        }

                        @Override // j$.util.stream.Sink.ChainedReference, j$.util.stream.Sink
                        public void begin(long j12) {
                            this.downstream.begin(SliceOps.calcSize(j12, j10, this.f18474m));
                        }

                        @Override // j$.util.stream.Sink.ChainedReference, j$.util.stream.Sink
                        public boolean cancellationRequested() {
                            return this.f18474m == 0 || this.downstream.cancellationRequested();
                        }
                    };
                }

                Spliterator unorderedSkipLimitSpliterator(Spliterator spliterator, long j12, long j13, long j14) {
                    long j15;
                    long j16;
                    if (j12 <= j14) {
                        long j17 = j14 - j12;
                        j16 = j13 >= 0 ? Math.min(j13, j17) : j17;
                        j15 = 0;
                    } else {
                        j15 = j12;
                        j16 = j13;
                    }
                    return new StreamSpliterators$UnorderedSliceSpliterator.OfRef(spliterator, j15, j16);
                }
            };
        }
        throw new IllegalArgumentException("Skip must be non-negative: " + j10);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static Spliterator sliceSpliterator(StreamShape streamShape, Spliterator spliterator, long j10, long j11) {
        long calcSliceFence = calcSliceFence(j10, j11);
        int i10 = AnonymousClass5.$SwitchMap$java$util$stream$StreamShape[streamShape.ordinal()];
        if (i10 != 1) {
            if (i10 != 2) {
                if (i10 != 3) {
                    if (i10 == 4) {
                        return new StreamSpliterators$SliceSpliterator.OfDouble((Spliterator.OfDouble) spliterator, j10, calcSliceFence);
                    }
                    throw new IllegalStateException("Unknown shape " + streamShape);
                }
                return new StreamSpliterators$SliceSpliterator.OfLong((Spliterator.OfLong) spliterator, j10, calcSliceFence);
            }
            return new StreamSpliterators$SliceSpliterator.OfInt((Spliterator.OfInt) spliterator, j10, calcSliceFence);
        }
        return new StreamSpliterators$SliceSpliterator.OfRef(spliterator, j10, calcSliceFence);
    }
}
