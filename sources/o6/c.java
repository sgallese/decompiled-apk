package o6;

import i6.p;
import i6.u;
import j6.m;
import java.util.concurrent.Executor;
import java.util.logging.Logger;
import p6.x;
import r6.a;

/* compiled from: DefaultScheduler.java */
/* loaded from: classes.dex */
public class c implements e {

    /* renamed from: f  reason: collision with root package name */
    private static final Logger f20549f = Logger.getLogger(u.class.getName());

    /* renamed from: a  reason: collision with root package name */
    private final x f20550a;

    /* renamed from: b  reason: collision with root package name */
    private final Executor f20551b;

    /* renamed from: c  reason: collision with root package name */
    private final j6.e f20552c;

    /* renamed from: d  reason: collision with root package name */
    private final q6.d f20553d;

    /* renamed from: e  reason: collision with root package name */
    private final r6.a f20554e;

    public c(Executor executor, j6.e eVar, x xVar, q6.d dVar, r6.a aVar) {
        this.f20551b = executor;
        this.f20552c = eVar;
        this.f20550a = xVar;
        this.f20553d = dVar;
        this.f20554e = aVar;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ Object d(p pVar, i6.i iVar) {
        this.f20553d.g(pVar, iVar);
        this.f20550a.a(pVar, 1);
        return null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void e(final p pVar, g6.h hVar, i6.i iVar) {
        try {
            m a10 = this.f20552c.a(pVar.b());
            if (a10 == null) {
                String format = String.format("Transport backend '%s' is not registered", pVar.b());
                f20549f.warning(format);
                hVar.a(new IllegalArgumentException(format));
                return;
            }
            final i6.i b10 = a10.b(iVar);
            this.f20554e.d(new a.InterfaceC0500a() { // from class: o6.b
                @Override // r6.a.InterfaceC0500a
                public final Object execute() {
                    Object d10;
                    d10 = c.this.d(pVar, b10);
                    return d10;
                }
            });
            hVar.a(null);
        } catch (Exception e10) {
            f20549f.warning("Error scheduling event " + e10.getMessage());
            hVar.a(e10);
        }
    }

    @Override // o6.e
    public void a(final p pVar, final i6.i iVar, final g6.h hVar) {
        this.f20551b.execute(new Runnable() { // from class: o6.a
            @Override // java.lang.Runnable
            public final void run() {
                c.this.e(pVar, hVar, iVar);
            }
        });
    }
}
