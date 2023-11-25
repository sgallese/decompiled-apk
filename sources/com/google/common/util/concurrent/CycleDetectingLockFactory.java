package com.google.common.util.concurrent;

import com.google.common.collect.k;
import com.google.common.collect.m;
import com.google.common.collect.n;
import j$.util.Objects;
import java.util.ArrayList;
import java.util.Map;
import java.util.concurrent.ConcurrentMap;
import java.util.logging.Logger;

/* loaded from: classes3.dex */
public class CycleDetectingLockFactory {

    /* renamed from: a  reason: collision with root package name */
    private static final ConcurrentMap<Class<? extends Enum<?>>, Map<? extends Enum<?>, c>> f11244a = new n().h().f();

    /* renamed from: b  reason: collision with root package name */
    private static final Logger f11245b = Logger.getLogger(CycleDetectingLockFactory.class.getName());

    /* renamed from: c  reason: collision with root package name */
    private static final ThreadLocal<ArrayList<c>> f11246c = new a();

    /* loaded from: classes3.dex */
    public static final class PotentialDeadlockException extends b {

        /* renamed from: p  reason: collision with root package name */
        private final b f11247p;

        @Override // java.lang.Throwable
        public String getMessage() {
            String message = super.getMessage();
            Objects.requireNonNull(message);
            StringBuilder sb2 = new StringBuilder(message);
            for (Throwable th = this.f11247p; th != null; th = th.getCause()) {
                sb2.append(", ");
                sb2.append(th.getMessage());
            }
            return sb2.toString();
        }
    }

    /* loaded from: classes3.dex */
    class a extends ThreadLocal<ArrayList<c>> {
        a() {
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // java.lang.ThreadLocal
        /* renamed from: a  reason: merged with bridge method [inline-methods] */
        public ArrayList<c> initialValue() {
            return m.f(3);
        }
    }

    /* loaded from: classes3.dex */
    private static class b extends IllegalStateException {

        /* renamed from: f  reason: collision with root package name */
        static final StackTraceElement[] f11248f = new StackTraceElement[0];

        /* renamed from: m  reason: collision with root package name */
        static final k<String> f11249m = k.p(CycleDetectingLockFactory.class.getName(), b.class.getName(), c.class.getName());
    }

    /* loaded from: classes3.dex */
    private static class c {
    }
}
