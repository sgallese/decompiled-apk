package com.habitrpg.shared.habitica;

import dc.w;
import qc.h;
import qc.q;

/* compiled from: Logger.kt */
/* loaded from: classes4.dex */
public final class HLogger {
    public static final Companion Companion = new Companion(null);
    private static final PlatformLogger platformLogger = new PlatformLogger();

    /* compiled from: Logger.kt */
    /* loaded from: classes4.dex */
    public static final class Companion {

        /* compiled from: Logger.kt */
        /* loaded from: classes4.dex */
        public /* synthetic */ class WhenMappings {
            public static final /* synthetic */ int[] $EnumSwitchMapping$0;

            static {
                int[] iArr = new int[LogLevel.values().length];
                try {
                    iArr[LogLevel.ERROR.ordinal()] = 1;
                } catch (NoSuchFieldError unused) {
                }
                try {
                    iArr[LogLevel.INFO.ordinal()] = 2;
                } catch (NoSuchFieldError unused2) {
                }
                try {
                    iArr[LogLevel.WARNING.ordinal()] = 3;
                } catch (NoSuchFieldError unused3) {
                }
                try {
                    iArr[LogLevel.DEBUG.ordinal()] = 4;
                } catch (NoSuchFieldError unused4) {
                }
                $EnumSwitchMapping$0 = iArr;
            }
        }

        private Companion() {
        }

        public /* synthetic */ Companion(h hVar) {
            this();
        }

        public static /* synthetic */ void logException$default(Companion companion, String str, String str2, Throwable th, int i10, Object obj) {
            if ((i10 & 4) != 0) {
                th = null;
            }
            companion.logException(str, str2, th);
        }

        public final boolean getEnabled() {
            return HLogger.platformLogger.getEnabled();
        }

        public final void log(LogLevel logLevel, String str, String str2) {
            q.i(logLevel, "level");
            q.i(str, "tag");
            q.i(str2, "message");
            if (!getEnabled()) {
                return;
            }
            int i10 = WhenMappings.$EnumSwitchMapping$0[logLevel.ordinal()];
            if (i10 != 1) {
                if (i10 != 2) {
                    if (i10 != 3) {
                        if (i10 == 4) {
                            HLogger.platformLogger.logDebug(str, str2);
                            return;
                        }
                        return;
                    }
                    HLogger.platformLogger.logWarning(str, str2);
                    return;
                }
                HLogger.platformLogger.logInfo(str, str2);
                return;
            }
            HLogger.platformLogger.logError(str, str2);
        }

        public final void logException(String str, String str2, Throwable th) {
            w wVar;
            q.i(str, "tag");
            q.i(str2, "message");
            if (!getEnabled()) {
                return;
            }
            if (th != null) {
                HLogger.platformLogger.logError(str, str2, th);
                wVar = w.f13270a;
            } else {
                wVar = null;
            }
            if (wVar == null) {
                HLogger.platformLogger.logError(str, str2);
            }
        }
    }
}
