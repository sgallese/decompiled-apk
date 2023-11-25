package com.google.firebase.perf.session.gauges;

import android.annotation.SuppressLint;
import android.content.Context;
import androidx.annotation.Keep;
import ba.g;
import com.google.firebase.perf.session.PerfSession;
import com.google.firebase.perf.util.Timer;
import java.util.concurrent.Executors;
import java.util.concurrent.RejectedExecutionException;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;
import k8.u;

@Keep
/* loaded from: classes3.dex */
public class GaugeManager {
    private static final long APPROX_NUMBER_OF_DATA_POINTS_PER_GAUGE_METRIC = 20;
    private static final long INVALID_GAUGE_COLLECTION_FREQUENCY = -1;
    private static final long TIME_TO_WAIT_BEFORE_FLUSHING_GAUGES_QUEUE_MS = 20;
    private ba.d applicationProcessState;
    private final com.google.firebase.perf.config.a configResolver;
    private final u<c> cpuGaugeCollector;
    private ScheduledFuture gaugeManagerDataCollectionJob;
    private final u<ScheduledExecutorService> gaugeManagerExecutor;
    private i gaugeMetadataManager;
    private final u<l> memoryGaugeCollector;
    private String sessionId;
    private final aa.k transportManager;
    private static final v9.a logger = v9.a.e();
    private static final GaugeManager instance = new GaugeManager();

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes3.dex */
    public static /* synthetic */ class a {

        /* renamed from: a  reason: collision with root package name */
        static final /* synthetic */ int[] f11847a;

        static {
            int[] iArr = new int[ba.d.values().length];
            f11847a = iArr;
            try {
                iArr[ba.d.BACKGROUND.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f11847a[ba.d.FOREGROUND.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
        }
    }

    @SuppressLint({"ThreadPoolCreation"})
    private GaugeManager() {
        this(new u(new i9.b() { // from class: com.google.firebase.perf.session.gauges.f
            @Override // i9.b
            public final Object get() {
                return Executors.newSingleThreadScheduledExecutor();
            }
        }), aa.k.k(), com.google.firebase.perf.config.a.g(), null, new u(new i9.b() { // from class: com.google.firebase.perf.session.gauges.g
            @Override // i9.b
            public final Object get() {
                c lambda$new$0;
                lambda$new$0 = GaugeManager.lambda$new$0();
                return lambda$new$0;
            }
        }), new u(new i9.b() { // from class: com.google.firebase.perf.session.gauges.h
            @Override // i9.b
            public final Object get() {
                l lambda$new$1;
                lambda$new$1 = GaugeManager.lambda$new$1();
                return lambda$new$1;
            }
        }));
    }

    private long getCpuGaugeCollectionFrequencyMs(ba.d dVar) {
        long y10;
        int i10 = a.f11847a[dVar.ordinal()];
        if (i10 != 1) {
            if (i10 != 2) {
                y10 = -1;
            } else {
                y10 = this.configResolver.z();
            }
        } else {
            y10 = this.configResolver.y();
        }
        if (c.f(y10)) {
            return -1L;
        }
        return y10;
    }

    private ba.f getGaugeMetadata() {
        return ba.f.W().E(this.gaugeMetadataManager.a()).F(this.gaugeMetadataManager.b()).G(this.gaugeMetadataManager.c()).build();
    }

    public static synchronized GaugeManager getInstance() {
        GaugeManager gaugeManager;
        synchronized (GaugeManager.class) {
            gaugeManager = instance;
        }
        return gaugeManager;
    }

    private long getMemoryGaugeCollectionFrequencyMs(ba.d dVar) {
        long B;
        int i10 = a.f11847a[dVar.ordinal()];
        if (i10 != 1) {
            if (i10 != 2) {
                B = -1;
            } else {
                B = this.configResolver.C();
            }
        } else {
            B = this.configResolver.B();
        }
        if (l.e(B)) {
            return -1L;
        }
        return B;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ c lambda$new$0() {
        return new c();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ l lambda$new$1() {
        return new l();
    }

    private boolean startCollectingCpuMetrics(long j10, Timer timer) {
        if (j10 == -1) {
            logger.a("Invalid Cpu Metrics collection frequency. Did not collect Cpu Metrics.");
            return false;
        }
        this.cpuGaugeCollector.get().k(j10, timer);
        return true;
    }

    private boolean startCollectingMemoryMetrics(long j10, Timer timer) {
        if (j10 == -1) {
            logger.a("Invalid Memory Metrics collection frequency. Did not collect Memory Metrics.");
            return false;
        }
        this.memoryGaugeCollector.get().j(j10, timer);
        return true;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: syncFlush  reason: merged with bridge method [inline-methods] and merged with bridge method [inline-methods] */
    public void lambda$stopCollectingGauges$3(String str, ba.d dVar) {
        g.b f02 = ba.g.f0();
        while (!this.cpuGaugeCollector.get().f11854a.isEmpty()) {
            f02.F(this.cpuGaugeCollector.get().f11854a.poll());
        }
        while (!this.memoryGaugeCollector.get().f11877b.isEmpty()) {
            f02.E(this.memoryGaugeCollector.get().f11877b.poll());
        }
        f02.H(str);
        this.transportManager.A(f02.build(), dVar);
    }

    public void collectGaugeMetricOnce(Timer timer) {
        collectGaugeMetricOnce(this.cpuGaugeCollector.get(), this.memoryGaugeCollector.get(), timer);
    }

    public void initializeGaugeMetadataManager(Context context) {
        this.gaugeMetadataManager = new i(context);
    }

    public boolean logGaugeMetadata(String str, ba.d dVar) {
        if (this.gaugeMetadataManager != null) {
            this.transportManager.A(ba.g.f0().H(str).G(getGaugeMetadata()).build(), dVar);
            return true;
        }
        return false;
    }

    public void startCollectingGauges(PerfSession perfSession, final ba.d dVar) {
        if (this.sessionId != null) {
            stopCollectingGauges();
        }
        long startCollectingGauges = startCollectingGauges(dVar, perfSession.d());
        if (startCollectingGauges == -1) {
            logger.j("Invalid gauge collection frequency. Unable to start collecting Gauges.");
            return;
        }
        final String h10 = perfSession.h();
        this.sessionId = h10;
        this.applicationProcessState = dVar;
        try {
            long j10 = startCollectingGauges * 20;
            this.gaugeManagerDataCollectionJob = this.gaugeManagerExecutor.get().scheduleAtFixedRate(new Runnable() { // from class: com.google.firebase.perf.session.gauges.e
                @Override // java.lang.Runnable
                public final void run() {
                    GaugeManager.this.lambda$startCollectingGauges$2(h10, dVar);
                }
            }, j10, j10, TimeUnit.MILLISECONDS);
        } catch (RejectedExecutionException e10) {
            logger.j("Unable to start collecting Gauges: " + e10.getMessage());
        }
    }

    public void stopCollectingGauges() {
        final String str = this.sessionId;
        if (str == null) {
            return;
        }
        final ba.d dVar = this.applicationProcessState;
        this.cpuGaugeCollector.get().l();
        this.memoryGaugeCollector.get().k();
        ScheduledFuture scheduledFuture = this.gaugeManagerDataCollectionJob;
        if (scheduledFuture != null) {
            scheduledFuture.cancel(false);
        }
        this.gaugeManagerExecutor.get().schedule(new Runnable() { // from class: com.google.firebase.perf.session.gauges.d
            @Override // java.lang.Runnable
            public final void run() {
                GaugeManager.this.lambda$stopCollectingGauges$3(str, dVar);
            }
        }, 20L, TimeUnit.MILLISECONDS);
        this.sessionId = null;
        this.applicationProcessState = ba.d.APPLICATION_PROCESS_STATE_UNKNOWN;
    }

    private static void collectGaugeMetricOnce(c cVar, l lVar, Timer timer) {
        cVar.c(timer);
        lVar.c(timer);
    }

    GaugeManager(u<ScheduledExecutorService> uVar, aa.k kVar, com.google.firebase.perf.config.a aVar, i iVar, u<c> uVar2, u<l> uVar3) {
        this.gaugeManagerDataCollectionJob = null;
        this.sessionId = null;
        this.applicationProcessState = ba.d.APPLICATION_PROCESS_STATE_UNKNOWN;
        this.gaugeManagerExecutor = uVar;
        this.transportManager = kVar;
        this.configResolver = aVar;
        this.gaugeMetadataManager = iVar;
        this.cpuGaugeCollector = uVar2;
        this.memoryGaugeCollector = uVar3;
    }

    private long startCollectingGauges(ba.d dVar, Timer timer) {
        long cpuGaugeCollectionFrequencyMs = getCpuGaugeCollectionFrequencyMs(dVar);
        if (!startCollectingCpuMetrics(cpuGaugeCollectionFrequencyMs, timer)) {
            cpuGaugeCollectionFrequencyMs = -1;
        }
        long memoryGaugeCollectionFrequencyMs = getMemoryGaugeCollectionFrequencyMs(dVar);
        return startCollectingMemoryMetrics(memoryGaugeCollectionFrequencyMs, timer) ? cpuGaugeCollectionFrequencyMs == -1 ? memoryGaugeCollectionFrequencyMs : Math.min(cpuGaugeCollectionFrequencyMs, memoryGaugeCollectionFrequencyMs) : cpuGaugeCollectionFrequencyMs;
    }
}
