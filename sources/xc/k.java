package xc;

import dc.w;
import java.util.Iterator;
import kotlin.coroutines.Continuation;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: SequenceBuilder.kt */
/* loaded from: classes4.dex */
public class k {

    /* JADX INFO: Add missing generic type declarations: [T] */
    /* compiled from: Sequences.kt */
    /* loaded from: classes4.dex */
    public static final class a<T> implements g<T> {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ pc.p f25965a;

        public a(pc.p pVar) {
            this.f25965a = pVar;
        }

        @Override // xc.g
        public Iterator<T> iterator() {
            Iterator<T> a10;
            a10 = k.a(this.f25965a);
            return a10;
        }
    }

    public static <T> Iterator<T> a(pc.p<? super i<? super T>, ? super Continuation<? super w>, ? extends Object> pVar) {
        Continuation<? super w> b10;
        qc.q.i(pVar, "block");
        h hVar = new h();
        b10 = ic.c.b(pVar, hVar, hVar);
        hVar.j(b10);
        return hVar;
    }

    public static <T> g<T> b(pc.p<? super i<? super T>, ? super Continuation<? super w>, ? extends Object> pVar) {
        qc.q.i(pVar, "block");
        return new a(pVar);
    }
}
