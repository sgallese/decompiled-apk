package com.google.protobuf;

import com.google.protobuf.j0;
import java.io.IOException;
import java.util.List;
import java.util.Map;

/* compiled from: Reader.java */
/* loaded from: classes3.dex */
interface e1 {
    @Deprecated
    <T> T A(Class<T> cls, o oVar) throws IOException;

    int B() throws IOException;

    void C(List<String> list) throws IOException;

    <T> T D(f1<T> f1Var, o oVar) throws IOException;

    <K, V> void E(Map<K, V> map, j0.a<K, V> aVar, o oVar) throws IOException;

    void F(List<String> list) throws IOException;

    h G() throws IOException;

    void H(List<Float> list) throws IOException;

    int I() throws IOException;

    boolean J() throws IOException;

    int K() throws IOException;

    void L(List<h> list) throws IOException;

    void M(List<Double> list) throws IOException;

    long N() throws IOException;

    String O() throws IOException;

    void P(List<Long> list) throws IOException;

    void a(List<Integer> list) throws IOException;

    long b() throws IOException;

    long c() throws IOException;

    void d(List<Integer> list) throws IOException;

    void e(List<Long> list) throws IOException;

    @Deprecated
    <T> void f(List<T> list, f1<T> f1Var, o oVar) throws IOException;

    void g(List<Integer> list) throws IOException;

    <T> T h(Class<T> cls, o oVar) throws IOException;

    int i() throws IOException;

    boolean j() throws IOException;

    <T> void k(List<T> list, f1<T> f1Var, o oVar) throws IOException;

    long l() throws IOException;

    void m(List<Long> list) throws IOException;

    @Deprecated
    <T> T n(f1<T> f1Var, o oVar) throws IOException;

    int o() throws IOException;

    void p(List<Long> list) throws IOException;

    void q(List<Long> list) throws IOException;

    void r(List<Integer> list) throws IOException;

    double readDouble() throws IOException;

    float readFloat() throws IOException;

    void s(List<Integer> list) throws IOException;

    int t() throws IOException;

    int u();

    void v(List<Integer> list) throws IOException;

    int w() throws IOException;

    long x() throws IOException;

    void y(List<Boolean> list) throws IOException;

    String z() throws IOException;
}
