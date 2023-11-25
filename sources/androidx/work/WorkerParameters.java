package androidx.work;

import android.net.Network;
import android.net.Uri;
import java.util.Collection;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.UUID;
import java.util.concurrent.Executor;

/* loaded from: classes.dex */
public final class WorkerParameters {

    /* renamed from: a  reason: collision with root package name */
    private UUID f7386a;

    /* renamed from: b  reason: collision with root package name */
    private e f7387b;

    /* renamed from: c  reason: collision with root package name */
    private Set<String> f7388c;

    /* renamed from: d  reason: collision with root package name */
    private a f7389d;

    /* renamed from: e  reason: collision with root package name */
    private int f7390e;

    /* renamed from: f  reason: collision with root package name */
    private Executor f7391f;

    /* renamed from: g  reason: collision with root package name */
    private p4.a f7392g;

    /* renamed from: h  reason: collision with root package name */
    private x f7393h;

    /* renamed from: i  reason: collision with root package name */
    private q f7394i;

    /* renamed from: j  reason: collision with root package name */
    private h f7395j;

    /* loaded from: classes.dex */
    public static class a {

        /* renamed from: a  reason: collision with root package name */
        public List<String> f7396a = Collections.emptyList();

        /* renamed from: b  reason: collision with root package name */
        public List<Uri> f7397b = Collections.emptyList();

        /* renamed from: c  reason: collision with root package name */
        public Network f7398c;
    }

    public WorkerParameters(UUID uuid, e eVar, Collection<String> collection, a aVar, int i10, Executor executor, p4.a aVar2, x xVar, q qVar, h hVar) {
        this.f7386a = uuid;
        this.f7387b = eVar;
        this.f7388c = new HashSet(collection);
        this.f7389d = aVar;
        this.f7390e = i10;
        this.f7391f = executor;
        this.f7392g = aVar2;
        this.f7393h = xVar;
        this.f7394i = qVar;
        this.f7395j = hVar;
    }

    public Executor a() {
        return this.f7391f;
    }

    public h b() {
        return this.f7395j;
    }

    public UUID c() {
        return this.f7386a;
    }

    public e d() {
        return this.f7387b;
    }

    public Network e() {
        return this.f7389d.f7398c;
    }

    public q f() {
        return this.f7394i;
    }

    public int g() {
        return this.f7390e;
    }

    public Set<String> h() {
        return this.f7388c;
    }

    public p4.a i() {
        return this.f7392g;
    }

    public List<String> j() {
        return this.f7389d.f7396a;
    }

    public List<Uri> k() {
        return this.f7389d.f7397b;
    }

    public x l() {
        return this.f7393h;
    }
}
