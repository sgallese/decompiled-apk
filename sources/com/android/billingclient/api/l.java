package com.android.billingclient.api;

import com.android.billingclient.api.d;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: com.android.billingclient:billing@@6.0.1 */
/* loaded from: classes.dex */
public final class l {
    static final d A;
    static final d B;
    static final d C;

    /* renamed from: a  reason: collision with root package name */
    static final d f9210a;

    /* renamed from: b  reason: collision with root package name */
    static final d f9211b;

    /* renamed from: c  reason: collision with root package name */
    static final d f9212c;

    /* renamed from: d  reason: collision with root package name */
    static final d f9213d;

    /* renamed from: e  reason: collision with root package name */
    static final d f9214e;

    /* renamed from: f  reason: collision with root package name */
    static final d f9215f;

    /* renamed from: g  reason: collision with root package name */
    static final d f9216g;

    /* renamed from: h  reason: collision with root package name */
    static final d f9217h;

    /* renamed from: i  reason: collision with root package name */
    static final d f9218i;

    /* renamed from: j  reason: collision with root package name */
    static final d f9219j;

    /* renamed from: k  reason: collision with root package name */
    static final d f9220k;

    /* renamed from: l  reason: collision with root package name */
    static final d f9221l;

    /* renamed from: m  reason: collision with root package name */
    static final d f9222m;

    /* renamed from: n  reason: collision with root package name */
    static final d f9223n;

    /* renamed from: o  reason: collision with root package name */
    static final d f9224o;

    /* renamed from: p  reason: collision with root package name */
    static final d f9225p;

    /* renamed from: q  reason: collision with root package name */
    static final d f9226q;

    /* renamed from: r  reason: collision with root package name */
    static final d f9227r;

    /* renamed from: s  reason: collision with root package name */
    static final d f9228s;

    /* renamed from: t  reason: collision with root package name */
    static final d f9229t;

    /* renamed from: u  reason: collision with root package name */
    static final d f9230u;

    /* renamed from: v  reason: collision with root package name */
    static final d f9231v;

    /* renamed from: w  reason: collision with root package name */
    static final d f9232w;

    /* renamed from: x  reason: collision with root package name */
    static final d f9233x;

    /* renamed from: y  reason: collision with root package name */
    static final d f9234y;

    /* renamed from: z  reason: collision with root package name */
    static final d f9235z;

    static {
        d.a c10 = d.c();
        c10.c(3);
        c10.b("Google Play In-app Billing API version is less than 3");
        f9210a = c10.a();
        d.a c11 = d.c();
        c11.c(3);
        c11.b("Google Play In-app Billing API version is less than 9");
        f9211b = c11.a();
        d.a c12 = d.c();
        c12.c(3);
        c12.b("Billing service unavailable on device.");
        f9212c = c12.a();
        d.a c13 = d.c();
        c13.c(5);
        c13.b("Client is already in the process of connecting to billing service.");
        f9213d = c13.a();
        d.a c14 = d.c();
        c14.c(5);
        c14.b("The list of SKUs can't be empty.");
        f9214e = c14.a();
        d.a c15 = d.c();
        c15.c(5);
        c15.b("SKU type can't be empty.");
        f9215f = c15.a();
        d.a c16 = d.c();
        c16.c(5);
        c16.b("Product type can't be empty.");
        f9216g = c16.a();
        d.a c17 = d.c();
        c17.c(-2);
        c17.b("Client does not support extra params.");
        f9217h = c17.a();
        d.a c18 = d.c();
        c18.c(5);
        c18.b("Invalid purchase token.");
        f9218i = c18.a();
        d.a c19 = d.c();
        c19.c(6);
        c19.b("An internal error occurred.");
        f9219j = c19.a();
        d.a c20 = d.c();
        c20.c(5);
        c20.b("SKU can't be null.");
        f9220k = c20.a();
        d.a c21 = d.c();
        c21.c(0);
        f9221l = c21.a();
        d.a c22 = d.c();
        c22.c(-1);
        c22.b("Service connection is disconnected.");
        f9222m = c22.a();
        d.a c23 = d.c();
        c23.c(2);
        c23.b("Timeout communicating with service.");
        f9223n = c23.a();
        d.a c24 = d.c();
        c24.c(-2);
        c24.b("Client does not support subscriptions.");
        f9224o = c24.a();
        d.a c25 = d.c();
        c25.c(-2);
        c25.b("Client does not support subscriptions update.");
        f9225p = c25.a();
        d.a c26 = d.c();
        c26.c(-2);
        c26.b("Client does not support get purchase history.");
        f9226q = c26.a();
        d.a c27 = d.c();
        c27.c(-2);
        c27.b("Client does not support price change confirmation.");
        f9227r = c27.a();
        d.a c28 = d.c();
        c28.c(-2);
        c28.b("Play Store version installed does not support cross selling products.");
        f9228s = c28.a();
        d.a c29 = d.c();
        c29.c(-2);
        c29.b("Client does not support multi-item purchases.");
        f9229t = c29.a();
        d.a c30 = d.c();
        c30.c(-2);
        c30.b("Client does not support offer_id_token.");
        f9230u = c30.a();
        d.a c31 = d.c();
        c31.c(-2);
        c31.b("Client does not support ProductDetails.");
        f9231v = c31.a();
        d.a c32 = d.c();
        c32.c(-2);
        c32.b("Client does not support in-app messages.");
        f9232w = c32.a();
        d.a c33 = d.c();
        c33.c(-2);
        c33.b("Client does not support alternative billing.");
        f9233x = c33.a();
        d.a c34 = d.c();
        c34.c(5);
        c34.b("Unknown feature");
        f9234y = c34.a();
        d.a c35 = d.c();
        c35.c(-2);
        c35.b("Play Store version installed does not support get billing config.");
        f9235z = c35.a();
        d.a c36 = d.c();
        c36.c(-2);
        c36.b("Query product details with serialized docid is not supported.");
        A = c36.a();
        d.a c37 = d.c();
        c37.c(4);
        c37.b("Item is unavailable for purchase.");
        B = c37.a();
        d.a c38 = d.c();
        c38.c(-2);
        c38.b("Query product details with developer specified account is not supported.");
        C = c38.a();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static d a(int i10, String str) {
        d.a c10 = d.c();
        c10.c(i10);
        c10.b(str);
        return c10.a();
    }
}
