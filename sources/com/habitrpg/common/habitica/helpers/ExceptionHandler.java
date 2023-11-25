package com.habitrpg.common.habitica.helpers;

import ad.h0;
import coil.network.HttpException;
import dc.w;
import java.io.IOException;
import java.util.concurrent.CancellationException;
import pc.l;
import qc.q;

/* compiled from: ExceptionHandler.kt */
/* loaded from: classes4.dex */
public final class ExceptionHandler {
    public static final Companion Companion = new Companion(null);
    private static ExceptionHandler instance = new ExceptionHandler();
    private l<? super Throwable, w> exceptionLogger;

    /* compiled from: ExceptionHandler.kt */
    /* loaded from: classes4.dex */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(qc.h hVar) {
            this();
        }

        /* JADX WARN: Multi-variable type inference failed */
        public static /* synthetic */ h0 coroutine$default(Companion companion, l lVar, int i10, Object obj) {
            if ((i10 & 1) != 0) {
                lVar = null;
            }
            return companion.coroutine(lVar);
        }

        /* JADX WARN: Multi-variable type inference failed */
        public static /* synthetic */ void init$default(Companion companion, l lVar, int i10, Object obj) {
            if ((i10 & 1) != 0) {
                lVar = null;
            }
            companion.init(lVar);
        }

        public final h0 coroutine(l<? super Throwable, w> lVar) {
            return new ExceptionHandler$Companion$coroutine$$inlined$CoroutineExceptionHandler$1(h0.f516a, lVar);
        }

        public final void init(l<? super Throwable, w> lVar) {
            ExceptionHandler.instance.exceptionLogger = lVar;
        }

        public final void reportError(Throwable th) {
            l lVar;
            q.i(th, "throwable");
            if (!(th instanceof IOException) && !(th instanceof HttpException) && !(th instanceof CancellationException) && (lVar = ExceptionHandler.instance.exceptionLogger) != null) {
                lVar.invoke(th);
            }
        }
    }
}
