package jd;

import dc.w;
import kotlin.coroutines.Continuation;

/* compiled from: Mutex.kt */
/* loaded from: classes4.dex */
public interface a {

    /* compiled from: Mutex.kt */
    /* renamed from: jd.a$a  reason: collision with other inner class name */
    /* loaded from: classes4.dex */
    public static final class C0427a {
        public static /* synthetic */ Object a(a aVar, Object obj, Continuation continuation, int i10, Object obj2) {
            if (obj2 == null) {
                if ((i10 & 1) != 0) {
                    obj = null;
                }
                return aVar.c(obj, continuation);
            }
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: lock");
        }

        public static /* synthetic */ boolean b(a aVar, Object obj, int i10, Object obj2) {
            if (obj2 == null) {
                if ((i10 & 1) != 0) {
                    obj = null;
                }
                return aVar.a(obj);
            }
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: tryLock");
        }

        public static /* synthetic */ void c(a aVar, Object obj, int i10, Object obj2) {
            if (obj2 == null) {
                if ((i10 & 1) != 0) {
                    obj = null;
                }
                aVar.d(obj);
                return;
            }
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: unlock");
        }
    }

    boolean a(Object obj);

    Object c(Object obj, Continuation<? super w> continuation);

    void d(Object obj);
}
