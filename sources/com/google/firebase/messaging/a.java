package com.google.firebase.messaging;

import java.io.IOException;

/* compiled from: AutoProtoEncoderDoNotUseEncoder.java */
/* loaded from: classes3.dex */
public final class a implements c9.a {

    /* renamed from: a  reason: collision with root package name */
    public static final c9.a f11585a = new a();

    /* compiled from: AutoProtoEncoderDoNotUseEncoder.java */
    /* renamed from: com.google.firebase.messaging.a$a  reason: collision with other inner class name */
    /* loaded from: classes3.dex */
    private static final class C0250a implements b9.c<q9.a> {

        /* renamed from: a  reason: collision with root package name */
        static final C0250a f11586a = new C0250a();

        /* renamed from: b  reason: collision with root package name */
        private static final b9.b f11587b = b9.b.a("projectNumber").b(e9.a.b().c(1).a()).a();

        /* renamed from: c  reason: collision with root package name */
        private static final b9.b f11588c = b9.b.a("messageId").b(e9.a.b().c(2).a()).a();

        /* renamed from: d  reason: collision with root package name */
        private static final b9.b f11589d = b9.b.a("instanceId").b(e9.a.b().c(3).a()).a();

        /* renamed from: e  reason: collision with root package name */
        private static final b9.b f11590e = b9.b.a("messageType").b(e9.a.b().c(4).a()).a();

        /* renamed from: f  reason: collision with root package name */
        private static final b9.b f11591f = b9.b.a("sdkPlatform").b(e9.a.b().c(5).a()).a();

        /* renamed from: g  reason: collision with root package name */
        private static final b9.b f11592g = b9.b.a("packageName").b(e9.a.b().c(6).a()).a();

        /* renamed from: h  reason: collision with root package name */
        private static final b9.b f11593h = b9.b.a("collapseKey").b(e9.a.b().c(7).a()).a();

        /* renamed from: i  reason: collision with root package name */
        private static final b9.b f11594i = b9.b.a("priority").b(e9.a.b().c(8).a()).a();

        /* renamed from: j  reason: collision with root package name */
        private static final b9.b f11595j = b9.b.a("ttl").b(e9.a.b().c(9).a()).a();

        /* renamed from: k  reason: collision with root package name */
        private static final b9.b f11596k = b9.b.a("topic").b(e9.a.b().c(10).a()).a();

        /* renamed from: l  reason: collision with root package name */
        private static final b9.b f11597l = b9.b.a("bulkId").b(e9.a.b().c(11).a()).a();

        /* renamed from: m  reason: collision with root package name */
        private static final b9.b f11598m = b9.b.a("event").b(e9.a.b().c(12).a()).a();

        /* renamed from: n  reason: collision with root package name */
        private static final b9.b f11599n = b9.b.a("analyticsLabel").b(e9.a.b().c(13).a()).a();

        /* renamed from: o  reason: collision with root package name */
        private static final b9.b f11600o = b9.b.a("campaignId").b(e9.a.b().c(14).a()).a();

        /* renamed from: p  reason: collision with root package name */
        private static final b9.b f11601p = b9.b.a("composerLabel").b(e9.a.b().c(15).a()).a();

        private C0250a() {
        }

        @Override // b9.c
        /* renamed from: b  reason: merged with bridge method [inline-methods] */
        public void a(q9.a aVar, b9.d dVar) throws IOException {
            dVar.e(f11587b, aVar.l());
            dVar.a(f11588c, aVar.h());
            dVar.a(f11589d, aVar.g());
            dVar.a(f11590e, aVar.i());
            dVar.a(f11591f, aVar.m());
            dVar.a(f11592g, aVar.j());
            dVar.a(f11593h, aVar.d());
            dVar.c(f11594i, aVar.k());
            dVar.c(f11595j, aVar.o());
            dVar.a(f11596k, aVar.n());
            dVar.e(f11597l, aVar.b());
            dVar.a(f11598m, aVar.f());
            dVar.a(f11599n, aVar.a());
            dVar.e(f11600o, aVar.c());
            dVar.a(f11601p, aVar.e());
        }
    }

    /* compiled from: AutoProtoEncoderDoNotUseEncoder.java */
    /* loaded from: classes3.dex */
    private static final class b implements b9.c<q9.b> {

        /* renamed from: a  reason: collision with root package name */
        static final b f11602a = new b();

        /* renamed from: b  reason: collision with root package name */
        private static final b9.b f11603b = b9.b.a("messagingClientEvent").b(e9.a.b().c(1).a()).a();

        private b() {
        }

        @Override // b9.c
        /* renamed from: b  reason: merged with bridge method [inline-methods] */
        public void a(q9.b bVar, b9.d dVar) throws IOException {
            dVar.a(f11603b, bVar.a());
        }
    }

    /* compiled from: AutoProtoEncoderDoNotUseEncoder.java */
    /* loaded from: classes3.dex */
    private static final class c implements b9.c<h0> {

        /* renamed from: a  reason: collision with root package name */
        static final c f11604a = new c();

        /* renamed from: b  reason: collision with root package name */
        private static final b9.b f11605b = b9.b.d("messagingClientEventExtension");

        private c() {
        }

        @Override // b9.c
        /* renamed from: b  reason: merged with bridge method [inline-methods] */
        public void a(h0 h0Var, b9.d dVar) throws IOException {
            dVar.a(f11605b, h0Var.b());
        }
    }

    private a() {
    }

    @Override // c9.a
    public void a(c9.b<?> bVar) {
        bVar.a(h0.class, c.f11604a);
        bVar.a(q9.b.class, b.f11602a);
        bVar.a(q9.a.class, C0250a.f11586a);
    }
}
