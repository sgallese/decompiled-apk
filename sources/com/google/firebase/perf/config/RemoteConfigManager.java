package com.google.firebase.perf.config;

import android.annotation.SuppressLint;
import android.content.Context;
import android.content.pm.PackageManager;
import androidx.annotation.Keep;
import com.google.android.gms.common.util.VisibleForTesting;
import com.google.android.gms.tasks.OnFailureListener;
import com.google.android.gms.tasks.OnSuccessListener;
import j$.util.concurrent.ConcurrentHashMap;
import java.util.Map;
import java.util.Random;
import java.util.concurrent.Executor;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

@Keep
/* loaded from: classes3.dex */
public class RemoteConfigManager {
    private static final long FETCH_NEVER_HAPPENED_TIMESTAMP_MS = 0;
    private static final String FIREPERF_FRC_NAMESPACE_NAME = "fireperf";
    private static final long MIN_APP_START_CONFIG_FETCH_DELAY_MS = 5000;
    private static final int RANDOM_APP_START_CONFIG_FETCH_DELAY_MS = 25000;
    private final ConcurrentHashMap<String, da.l> allRcConfigMap;
    private final long appStartConfigFetchDelayInMs;
    private final long appStartTimeInMs;
    private final x cache;
    private final Executor executor;
    private com.google.firebase.remoteconfig.a firebaseRemoteConfig;
    private long firebaseRemoteConfigLastFetchTimestampMs;
    private i9.b<com.google.firebase.remoteconfig.c> firebaseRemoteConfigProvider;
    private static final v9.a logger = v9.a.e();
    private static final RemoteConfigManager instance = new RemoteConfigManager();
    private static final long TIME_AFTER_WHICH_A_FETCH_IS_CONSIDERED_STALE_MS = TimeUnit.HOURS.toMillis(12);

    @SuppressLint({"ThreadPoolCreation"})
    private RemoteConfigManager() {
        this(x.e(), new ThreadPoolExecutor(0, 1, FETCH_NEVER_HAPPENED_TIMESTAMP_MS, TimeUnit.SECONDS, new LinkedBlockingQueue()), null, new Random().nextInt(RANDOM_APP_START_CONFIG_FETCH_DELAY_MS) + MIN_APP_START_CONFIG_FETCH_DELAY_MS, getInitialStartupMillis());
    }

    @VisibleForTesting
    static long getInitialStartupMillis() {
        com.google.firebase.l lVar = (com.google.firebase.l) com.google.firebase.e.k().i(com.google.firebase.l.class);
        if (lVar != null) {
            return lVar.c();
        }
        return System.currentTimeMillis();
    }

    public static RemoteConfigManager getInstance() {
        return instance;
    }

    private da.l getRemoteConfigValue(String str) {
        triggerRemoteConfigFetchIfNecessary();
        if (isFirebaseRemoteConfigAvailable() && this.allRcConfigMap.containsKey(str)) {
            da.l lVar = this.allRcConfigMap.get(str);
            if (lVar.b() == 2) {
                logger.b("Fetched value: '%s' for key: '%s' from Firebase Remote Config.", lVar.d(), str);
                return lVar;
            }
            return null;
        }
        return null;
    }

    @VisibleForTesting
    public static int getVersionCode(Context context) {
        try {
            return context.getPackageManager().getPackageInfo(context.getPackageName(), 0).versionCode;
        } catch (PackageManager.NameNotFoundException unused) {
            return 0;
        }
    }

    private boolean hasAppStartConfigFetchDelayElapsed(long j10) {
        if (j10 - this.appStartTimeInMs >= this.appStartConfigFetchDelayInMs) {
            return true;
        }
        return false;
    }

    private boolean hasLastFetchBecomeStale(long j10) {
        if (j10 - this.firebaseRemoteConfigLastFetchTimestampMs > TIME_AFTER_WHICH_A_FETCH_IS_CONSIDERED_STALE_MS) {
            return true;
        }
        return false;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$triggerFirebaseRemoteConfigFetchAndActivateOnSuccessfulFetch$0(Boolean bool) {
        syncConfigValues(this.firebaseRemoteConfig.j());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$triggerFirebaseRemoteConfigFetchAndActivateOnSuccessfulFetch$1(Exception exc) {
        this.firebaseRemoteConfigLastFetchTimestampMs = FETCH_NEVER_HAPPENED_TIMESTAMP_MS;
    }

    private boolean shouldFetchAndActivateRemoteConfigValues() {
        long currentSystemTimeMillis = getCurrentSystemTimeMillis();
        if (hasAppStartConfigFetchDelayElapsed(currentSystemTimeMillis) && hasLastFetchBecomeStale(currentSystemTimeMillis)) {
            return true;
        }
        return false;
    }

    private void triggerFirebaseRemoteConfigFetchAndActivateOnSuccessfulFetch() {
        this.firebaseRemoteConfigLastFetchTimestampMs = getCurrentSystemTimeMillis();
        this.firebaseRemoteConfig.i().addOnSuccessListener(this.executor, new OnSuccessListener() { // from class: com.google.firebase.perf.config.y
            @Override // com.google.android.gms.tasks.OnSuccessListener
            public final void onSuccess(Object obj) {
                RemoteConfigManager.this.lambda$triggerFirebaseRemoteConfigFetchAndActivateOnSuccessfulFetch$0((Boolean) obj);
            }
        }).addOnFailureListener(this.executor, new OnFailureListener() { // from class: com.google.firebase.perf.config.z
            @Override // com.google.android.gms.tasks.OnFailureListener
            public final void onFailure(Exception exc) {
                RemoteConfigManager.this.lambda$triggerFirebaseRemoteConfigFetchAndActivateOnSuccessfulFetch$1(exc);
            }
        });
    }

    private void triggerRemoteConfigFetchIfNecessary() {
        if (!isFirebaseRemoteConfigAvailable()) {
            return;
        }
        if (this.allRcConfigMap.isEmpty()) {
            this.allRcConfigMap.putAll(this.firebaseRemoteConfig.j());
        }
        if (shouldFetchAndActivateRemoteConfigValues()) {
            triggerFirebaseRemoteConfigFetchAndActivateOnSuccessfulFetch();
        }
    }

    public com.google.firebase.perf.util.g<Boolean> getBoolean(String str) {
        if (str == null) {
            logger.a("The key to get Remote Config boolean value is null.");
            return com.google.firebase.perf.util.g.a();
        }
        da.l remoteConfigValue = getRemoteConfigValue(str);
        if (remoteConfigValue != null) {
            try {
                return com.google.firebase.perf.util.g.e(Boolean.valueOf(remoteConfigValue.e()));
            } catch (IllegalArgumentException unused) {
                if (!remoteConfigValue.d().isEmpty()) {
                    logger.b("Could not parse value: '%s' for key: '%s'.", remoteConfigValue.d(), str);
                }
            }
        }
        return com.google.firebase.perf.util.g.a();
    }

    @VisibleForTesting
    protected long getCurrentSystemTimeMillis() {
        return System.currentTimeMillis();
    }

    public com.google.firebase.perf.util.g<Float> getFloat(String str) {
        if (str == null) {
            logger.a("The key to get Remote Config float value is null.");
            return com.google.firebase.perf.util.g.a();
        }
        da.l remoteConfigValue = getRemoteConfigValue(str);
        if (remoteConfigValue != null) {
            try {
                return com.google.firebase.perf.util.g.e(Float.valueOf(Double.valueOf(remoteConfigValue.c()).floatValue()));
            } catch (IllegalArgumentException unused) {
                if (!remoteConfigValue.d().isEmpty()) {
                    logger.b("Could not parse value: '%s' for key: '%s'.", remoteConfigValue.d(), str);
                }
            }
        }
        return com.google.firebase.perf.util.g.a();
    }

    public com.google.firebase.perf.util.g<Long> getLong(String str) {
        if (str == null) {
            logger.a("The key to get Remote Config long value is null.");
            return com.google.firebase.perf.util.g.a();
        }
        da.l remoteConfigValue = getRemoteConfigValue(str);
        if (remoteConfigValue != null) {
            try {
                return com.google.firebase.perf.util.g.e(Long.valueOf(remoteConfigValue.a()));
            } catch (IllegalArgumentException unused) {
                if (!remoteConfigValue.d().isEmpty()) {
                    logger.b("Could not parse value: '%s' for key: '%s'.", remoteConfigValue.d(), str);
                }
            }
        }
        return com.google.firebase.perf.util.g.a();
    }

    /* JADX WARN: Multi-variable type inference failed */
    public <T> T getRemoteConfigValueOrDefault(String str, T t10) {
        Object obj;
        da.l remoteConfigValue = getRemoteConfigValue(str);
        if (remoteConfigValue != null) {
            try {
                if (t10 instanceof Boolean) {
                    obj = Boolean.valueOf(remoteConfigValue.e());
                } else if (t10 instanceof Float) {
                    obj = Float.valueOf(Double.valueOf(remoteConfigValue.c()).floatValue());
                } else {
                    if (!(t10 instanceof Long) && !(t10 instanceof Integer)) {
                        if (t10 instanceof String) {
                            obj = remoteConfigValue.d();
                        } else {
                            T t11 = (T) remoteConfigValue.d();
                            try {
                                logger.b("No matching type found for the defaultValue: '%s', using String.", t10);
                                return t11;
                            } catch (IllegalArgumentException unused) {
                                t10 = t11;
                                if (!remoteConfigValue.d().isEmpty()) {
                                    logger.b("Could not parse value: '%s' for key: '%s'.", remoteConfigValue.d(), str);
                                    return t10;
                                }
                                return t10;
                            }
                        }
                    }
                    obj = Long.valueOf(remoteConfigValue.a());
                }
                return obj;
            } catch (IllegalArgumentException unused2) {
            }
        } else {
            return t10;
        }
    }

    public com.google.firebase.perf.util.g<String> getString(String str) {
        if (str == null) {
            logger.a("The key to get Remote Config String value is null.");
            return com.google.firebase.perf.util.g.a();
        }
        da.l remoteConfigValue = getRemoteConfigValue(str);
        if (remoteConfigValue != null) {
            return com.google.firebase.perf.util.g.e(remoteConfigValue.d());
        }
        return com.google.firebase.perf.util.g.a();
    }

    public boolean isFirebaseRemoteConfigAvailable() {
        i9.b<com.google.firebase.remoteconfig.c> bVar;
        com.google.firebase.remoteconfig.c cVar;
        if (this.firebaseRemoteConfig == null && (bVar = this.firebaseRemoteConfigProvider) != null && (cVar = bVar.get()) != null) {
            this.firebaseRemoteConfig = cVar.d(FIREPERF_FRC_NAMESPACE_NAME);
        }
        if (this.firebaseRemoteConfig != null) {
            return true;
        }
        return false;
    }

    public boolean isLastFetchFailed() {
        com.google.firebase.remoteconfig.a aVar = this.firebaseRemoteConfig;
        if (aVar == null || aVar.l().a() == 1) {
            return true;
        }
        return false;
    }

    public void setFirebaseRemoteConfigProvider(i9.b<com.google.firebase.remoteconfig.c> bVar) {
        this.firebaseRemoteConfigProvider = bVar;
    }

    @VisibleForTesting
    protected void syncConfigValues(Map<String, da.l> map) {
        this.allRcConfigMap.putAll(map);
        for (String str : this.allRcConfigMap.keySet()) {
            if (!map.containsKey(str)) {
                this.allRcConfigMap.remove(str);
            }
        }
        d e10 = d.e();
        da.l lVar = this.allRcConfigMap.get(e10.c());
        if (lVar != null) {
            try {
                this.cache.m(e10.a(), lVar.e());
                return;
            } catch (Exception unused) {
                logger.a("ExperimentTTID remote config flag has invalid value, expected boolean.");
                return;
            }
        }
        logger.a("ExperimentTTID remote config flag does not exist.");
    }

    @VisibleForTesting
    RemoteConfigManager(x xVar, Executor executor, com.google.firebase.remoteconfig.a aVar, long j10, long j11) {
        ConcurrentHashMap<String, da.l> concurrentHashMap;
        this.firebaseRemoteConfigLastFetchTimestampMs = FETCH_NEVER_HAPPENED_TIMESTAMP_MS;
        this.cache = xVar;
        this.executor = executor;
        this.firebaseRemoteConfig = aVar;
        if (aVar == null) {
            concurrentHashMap = new ConcurrentHashMap<>();
        } else {
            concurrentHashMap = new ConcurrentHashMap<>(aVar.j());
        }
        this.allRcConfigMap = concurrentHashMap;
        this.appStartTimeInMs = j11;
        this.appStartConfigFetchDelayInMs = j10;
    }
}
