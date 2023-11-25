package com.google.android.gms.internal.ads;

import android.util.JsonReader;
import com.habitrpg.android.habitica.models.social.Challenge;
import java.io.IOException;
import java.util.Collections;
import java.util.List;
import org.json.JSONException;
import org.json.JSONObject;

/* compiled from: com.google.android.gms:play-services-ads@@22.4.0 */
/* loaded from: classes3.dex */
public final class zzfbe {
    public final String zzA;
    public final zzbwy zzB;
    public final String zzC;
    public final JSONObject zzD;
    public final JSONObject zzE;
    public final String zzF;
    public final String zzG;
    public final String zzH;
    public final String zzI;
    public final String zzJ;
    public final boolean zzK;
    public final boolean zzL;
    public final boolean zzM;
    public final boolean zzN;
    public final boolean zzO;
    public final boolean zzP;
    public final boolean zzQ;
    public final int zzR;
    public final int zzS;
    public final boolean zzT;
    public final boolean zzU;
    public final String zzV;
    public final zzfcd zzW;
    public final boolean zzX;
    public final boolean zzY;
    public final int zzZ;
    public final List zza;
    public final String zzaa;
    public final int zzab;
    public final String zzac;
    public final boolean zzad;
    public final zzbsi zzae;
    public final com.google.android.gms.ads.internal.client.zzs zzaf;
    public final String zzag;
    public final boolean zzah;
    public final JSONObject zzai;
    public final boolean zzaj;
    public final JSONObject zzak;
    public final boolean zzal;
    public final String zzam;
    public final boolean zzan;
    public final String zzao;
    public final String zzap;
    public final String zzaq;
    public final boolean zzar;
    public final int zzas;
    public final int zzb;
    public final List zzc;
    public final List zzd;
    public final List zze;
    public final int zzf;
    public final List zzg;
    public final List zzh;
    public final List zzi;
    public final List zzj;
    public final String zzk;
    public final String zzl;
    public final zzbvp zzm;
    public final List zzn;
    public final List zzo;
    public final List zzp;
    public final List zzq;
    public final int zzr;
    public final List zzs;
    public final zzfbk zzt;
    public final List zzu;
    public final List zzv;
    public final JSONObject zzw;
    public final String zzx;
    public final String zzy;
    public final String zzz;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r31v2, types: [java.util.List] */
    public zzfbe(JsonReader jsonReader) throws IllegalStateException, IOException, JSONException, NumberFormatException {
        String str;
        List list;
        List list2;
        char c10;
        zzfud zzfudVar;
        List emptyList = Collections.emptyList();
        List emptyList2 = Collections.emptyList();
        List emptyList3 = Collections.emptyList();
        List emptyList4 = Collections.emptyList();
        List emptyList5 = Collections.emptyList();
        List emptyList6 = Collections.emptyList();
        List emptyList7 = Collections.emptyList();
        List emptyList8 = Collections.emptyList();
        List emptyList9 = Collections.emptyList();
        List emptyList10 = Collections.emptyList();
        List emptyList11 = Collections.emptyList();
        List emptyList12 = Collections.emptyList();
        List emptyList13 = Collections.emptyList();
        List emptyList14 = Collections.emptyList();
        JSONObject jSONObject = new JSONObject();
        JSONObject jSONObject2 = new JSONObject();
        JSONObject jSONObject3 = new JSONObject();
        JSONObject jSONObject4 = new JSONObject();
        JSONObject jSONObject5 = new JSONObject();
        JSONObject jSONObject6 = new JSONObject();
        zzfud zzl = zzfud.zzl();
        jsonReader.beginObject();
        JSONObject jSONObject7 = jSONObject2;
        JSONObject jSONObject8 = jSONObject3;
        JSONObject jSONObject9 = jSONObject4;
        JSONObject jSONObject10 = jSONObject5;
        JSONObject jSONObject11 = jSONObject6;
        zzfud zzfudVar2 = zzl;
        String str2 = "";
        String str3 = str2;
        String str4 = str3;
        String str5 = str4;
        String str6 = str5;
        String str7 = str6;
        String str8 = str7;
        String str9 = str8;
        String str10 = str9;
        String str11 = str10;
        String str12 = str11;
        String str13 = str12;
        String str14 = str13;
        String str15 = str14;
        String str16 = str15;
        String str17 = str16;
        String str18 = str17;
        zzfbk zzfbkVar = null;
        zzbwy zzbwyVar = null;
        zzbsi zzbsiVar = null;
        com.google.android.gms.ads.internal.client.zzs zzsVar = null;
        String str19 = null;
        int i10 = 0;
        boolean z10 = false;
        boolean z11 = false;
        boolean z12 = false;
        boolean z13 = false;
        boolean z14 = false;
        boolean z15 = false;
        boolean z16 = false;
        int i11 = -1;
        int i12 = 0;
        boolean z17 = false;
        boolean z18 = false;
        boolean z19 = false;
        int i13 = 0;
        int i14 = -1;
        boolean z20 = false;
        boolean z21 = false;
        boolean z22 = false;
        boolean z23 = false;
        boolean z24 = false;
        boolean z25 = false;
        boolean z26 = false;
        int i15 = 0;
        List list3 = emptyList11;
        List list4 = emptyList12;
        List list5 = emptyList13;
        List list6 = emptyList14;
        JSONObject jSONObject12 = jSONObject;
        String str20 = str18;
        String str21 = str20;
        zzbvp zzbvpVar = null;
        int i16 = 0;
        int i17 = 0;
        while (jsonReader.hasNext()) {
            String nextName = jsonReader.nextName();
            if (nextName == null) {
                str = "";
            } else {
                str = nextName;
            }
            switch (str.hashCode()) {
                case -2138196627:
                    list = emptyList9;
                    list2 = emptyList10;
                    if (str.equals("ad_source_instance_name")) {
                        c10 = ';';
                        break;
                    }
                    c10 = 65535;
                    break;
                case -1980587809:
                    list = emptyList9;
                    list2 = emptyList10;
                    if (str.equals("debug_signals")) {
                        c10 = 28;
                        break;
                    }
                    c10 = 65535;
                    break;
                case -1965512151:
                    list = emptyList9;
                    list2 = emptyList10;
                    if (str.equals("omid_settings")) {
                        c10 = ')';
                        break;
                    }
                    c10 = 65535;
                    break;
                case -1871425831:
                    list = emptyList9;
                    list2 = emptyList10;
                    if (str.equals("recursive_server_response_data")) {
                        c10 = 'E';
                        break;
                    }
                    c10 = 65535;
                    break;
                case -1843156475:
                    list = emptyList9;
                    list2 = emptyList10;
                    if (str.equals("is_consent")) {
                        c10 = 'F';
                        break;
                    }
                    c10 = 65535;
                    break;
                case -1812055556:
                    list = emptyList9;
                    list2 = emptyList10;
                    if (str.equals("play_prewarm_options")) {
                        c10 = '1';
                        break;
                    }
                    c10 = 65535;
                    break;
                case -1776946669:
                    list = emptyList9;
                    list2 = emptyList10;
                    if (str.equals("ad_source_name")) {
                        c10 = '9';
                        break;
                    }
                    c10 = 65535;
                    break;
                case -1662989631:
                    list = emptyList9;
                    list2 = emptyList10;
                    if (str.equals("is_interscroller")) {
                        c10 = '5';
                        break;
                    }
                    c10 = 65535;
                    break;
                case -1620470467:
                    list = emptyList9;
                    list2 = emptyList10;
                    if (str.equals("backend_query_id")) {
                        c10 = '/';
                        break;
                    }
                    c10 = 65535;
                    break;
                case -1550155393:
                    list = emptyList9;
                    list2 = emptyList10;
                    if (str.equals("nofill_urls")) {
                        c10 = '\r';
                        break;
                    }
                    c10 = 65535;
                    break;
                case -1440104884:
                    list = emptyList9;
                    list2 = emptyList10;
                    if (str.equals("is_custom_close_blocked")) {
                        c10 = '#';
                        break;
                    }
                    c10 = 65535;
                    break;
                case -1439500848:
                    list = emptyList9;
                    list2 = emptyList10;
                    if (str.equals("orientation")) {
                        c10 = '%';
                        break;
                    }
                    c10 = 65535;
                    break;
                case -1428969291:
                    list = emptyList9;
                    list2 = emptyList10;
                    if (str.equals("enable_omid")) {
                        c10 = '\'';
                        break;
                    }
                    c10 = 65535;
                    break;
                case -1406227629:
                    list = emptyList9;
                    list2 = emptyList10;
                    if (str.equals("buffer_click_url_as_ready_to_ping")) {
                        c10 = 'C';
                        break;
                    }
                    c10 = 65535;
                    break;
                case -1403779768:
                    list = emptyList9;
                    list2 = emptyList10;
                    if (str.equals("showable_impression_type")) {
                        c10 = ',';
                        break;
                    }
                    c10 = 65535;
                    break;
                case -1375413093:
                    list = emptyList9;
                    list2 = emptyList10;
                    if (str.equals("ad_cover")) {
                        c10 = '6';
                        break;
                    }
                    c10 = 65535;
                    break;
                case -1360811658:
                    list = emptyList9;
                    list2 = emptyList10;
                    if (str.equals("ad_sizes")) {
                        c10 = 19;
                        break;
                    }
                    c10 = 65535;
                    break;
                case -1306015996:
                    list = emptyList9;
                    list2 = emptyList10;
                    if (str.equals("adapters")) {
                        c10 = 20;
                        break;
                    }
                    c10 = 65535;
                    break;
                case -1303332046:
                    list = emptyList9;
                    list2 = emptyList10;
                    if (str.equals("test_mode_enabled")) {
                        c10 = '\"';
                        break;
                    }
                    c10 = 65535;
                    break;
                case -1289032093:
                    list = emptyList9;
                    list2 = emptyList10;
                    if (str.equals("extras")) {
                        c10 = 29;
                        break;
                    }
                    c10 = 65535;
                    break;
                case -1240082064:
                    list = emptyList9;
                    list2 = emptyList10;
                    if (str.equals("ad_event_value")) {
                        c10 = '3';
                        break;
                    }
                    c10 = 65535;
                    break;
                case -1234181075:
                    list = emptyList9;
                    list2 = emptyList10;
                    if (str.equals("allow_pub_rendered_attribution")) {
                        c10 = 30;
                        break;
                    }
                    c10 = 65535;
                    break;
                case -1168140544:
                    list = emptyList9;
                    list2 = emptyList10;
                    if (str.equals("presentation_error_urls")) {
                        c10 = 14;
                        break;
                    }
                    c10 = 65535;
                    break;
                case -1152230954:
                    list = emptyList9;
                    list2 = emptyList10;
                    if (str.equals("ad_type")) {
                        c10 = 1;
                        break;
                    }
                    c10 = 65535;
                    break;
                case -1146534047:
                    list = emptyList9;
                    list2 = emptyList10;
                    if (str.equals("is_scroll_aware")) {
                        c10 = '+';
                        break;
                    }
                    c10 = 65535;
                    break;
                case -1115838944:
                    list = emptyList9;
                    list2 = emptyList10;
                    if (str.equals("fill_urls")) {
                        c10 = '\f';
                        break;
                    }
                    c10 = 65535;
                    break;
                case -1081936678:
                    list = emptyList9;
                    list2 = emptyList10;
                    if (str.equals("allocation_id")) {
                        c10 = 21;
                        break;
                    }
                    c10 = 65535;
                    break;
                case -1078050970:
                    list = emptyList9;
                    list2 = emptyList10;
                    if (str.equals("video_complete_urls")) {
                        c10 = '\b';
                        break;
                    }
                    c10 = 65535;
                    break;
                case -1051269058:
                    list = emptyList9;
                    list2 = emptyList10;
                    if (str.equals("active_view")) {
                        c10 = 25;
                        break;
                    }
                    c10 = 65535;
                    break;
                case -982608540:
                    list = emptyList9;
                    list2 = emptyList10;
                    if (str.equals("valid_from_timestamp")) {
                        c10 = '\n';
                        break;
                    }
                    c10 = 65535;
                    break;
                case -972056451:
                    list = emptyList9;
                    list2 = emptyList10;
                    if (str.equals("ad_source_instance_id")) {
                        c10 = '<';
                        break;
                    }
                    c10 = 65535;
                    break;
                case -776859333:
                    list = emptyList9;
                    list2 = emptyList10;
                    if (str.equals("click_urls")) {
                        c10 = 2;
                        break;
                    }
                    c10 = 65535;
                    break;
                case -544216775:
                    list = emptyList9;
                    list2 = emptyList10;
                    if (str.equals("safe_browsing")) {
                        c10 = 26;
                        break;
                    }
                    c10 = 65535;
                    break;
                case -437057161:
                    list = emptyList9;
                    list2 = emptyList10;
                    if (str.equals("imp_urls")) {
                        c10 = 3;
                        break;
                    }
                    c10 = 65535;
                    break;
                case -404433734:
                    list = emptyList9;
                    list2 = emptyList10;
                    if (str.equals("rtb_native_required_assets")) {
                        c10 = '>';
                        break;
                    }
                    c10 = 65535;
                    break;
                case -404326515:
                    list = emptyList9;
                    list2 = emptyList10;
                    if (str.equals("render_timeout_ms")) {
                        c10 = '&';
                        break;
                    }
                    c10 = 65535;
                    break;
                case -397704715:
                    list = emptyList9;
                    list2 = emptyList10;
                    if (str.equals("ad_close_time_ms")) {
                        c10 = '-';
                        break;
                    }
                    c10 = 65535;
                    break;
                case -388807511:
                    list = emptyList9;
                    list2 = emptyList10;
                    if (str.equals("content_url")) {
                        c10 = '@';
                        break;
                    }
                    c10 = 65535;
                    break;
                case -369773488:
                    list = emptyList9;
                    list2 = emptyList10;
                    if (str.equals("is_close_button_enabled")) {
                        c10 = '2';
                        break;
                    }
                    c10 = 65535;
                    break;
                case -213449460:
                    list = emptyList9;
                    list2 = emptyList10;
                    if (str.equals("force_disable_hardware_acceleration")) {
                        c10 = 'A';
                        break;
                    }
                    c10 = 65535;
                    break;
                case -213424028:
                    list = emptyList9;
                    list2 = emptyList10;
                    if (str.equals("watermark")) {
                        c10 = '.';
                        break;
                    }
                    c10 = 65535;
                    break;
                case -180214626:
                    list = emptyList9;
                    list2 = emptyList10;
                    if (str.equals("native_required_asset_viewability")) {
                        c10 = '?';
                        break;
                    }
                    c10 = 65535;
                    break;
                case -154616268:
                    list = emptyList9;
                    list2 = emptyList10;
                    if (str.equals("is_offline_ad")) {
                        c10 = '=';
                        break;
                    }
                    c10 = 65535;
                    break;
                case -29338502:
                    list = emptyList9;
                    list2 = emptyList10;
                    if (str.equals("allow_custom_click_gesture")) {
                        c10 = ' ';
                        break;
                    }
                    c10 = 65535;
                    break;
                case 3107:
                    list = emptyList9;
                    list2 = emptyList10;
                    if (str.equals("ad")) {
                        c10 = 18;
                        break;
                    }
                    c10 = 65535;
                    break;
                case 3355:
                    list = emptyList9;
                    list2 = emptyList10;
                    if (str.equals("id")) {
                        c10 = 23;
                        break;
                    }
                    c10 = 65535;
                    break;
                case 3076010:
                    list = emptyList9;
                    list2 = emptyList10;
                    if (str.equals("data")) {
                        c10 = 22;
                        break;
                    }
                    c10 = 65535;
                    break;
                case 37109963:
                    list = emptyList9;
                    list2 = emptyList10;
                    if (str.equals("request_id")) {
                        c10 = 'D';
                        break;
                    }
                    c10 = 65535;
                    break;
                case 63195984:
                    list = emptyList9;
                    list2 = emptyList10;
                    if (str.equals("render_test_label")) {
                        c10 = '!';
                        break;
                    }
                    c10 = 65535;
                    break;
                case 107433883:
                    list = emptyList9;
                    list2 = emptyList10;
                    if (str.equals("qdata")) {
                        c10 = 24;
                        break;
                    }
                    c10 = 65535;
                    break;
                case 230323073:
                    list = emptyList9;
                    list2 = emptyList10;
                    if (str.equals("ad_load_urls")) {
                        c10 = 4;
                        break;
                    }
                    c10 = 65535;
                    break;
                case 418392395:
                    list = emptyList9;
                    list2 = emptyList10;
                    if (str.equals("is_closable_area_disabled")) {
                        c10 = '$';
                        break;
                    }
                    c10 = 65535;
                    break;
                case 542250332:
                    list = emptyList9;
                    list2 = emptyList10;
                    if (str.equals("consent_form_action_identifier")) {
                        c10 = 'G';
                        break;
                    }
                    c10 = 65535;
                    break;
                case 549176928:
                    list = emptyList9;
                    list2 = emptyList10;
                    if (str.equals("presentation_error_timeout_ms")) {
                        c10 = 16;
                        break;
                    }
                    c10 = 65535;
                    break;
                case 597473788:
                    list = emptyList9;
                    list2 = emptyList10;
                    if (str.equals("debug_dialog_string")) {
                        c10 = 27;
                        break;
                    }
                    c10 = 65535;
                    break;
                case 754887508:
                    list = emptyList9;
                    list2 = emptyList10;
                    if (str.equals("container_sizes")) {
                        c10 = 17;
                        break;
                    }
                    c10 = 65535;
                    break;
                case 791122864:
                    list = emptyList9;
                    list2 = emptyList10;
                    if (str.equals("impression_type")) {
                        c10 = 5;
                        break;
                    }
                    c10 = 65535;
                    break;
                case 1010584092:
                    list = emptyList9;
                    list2 = emptyList10;
                    if (str.equals("transaction_id")) {
                        c10 = '\t';
                        break;
                    }
                    c10 = 65535;
                    break;
                case 1100650276:
                    list = emptyList9;
                    list2 = emptyList10;
                    if (str.equals(Challenge.TASK_ORDER_REWARDS)) {
                        c10 = 11;
                        break;
                    }
                    c10 = 65535;
                    break;
                case 1141602460:
                    list = emptyList9;
                    list2 = emptyList10;
                    if (str.equals("adapter_response_info_key")) {
                        c10 = '8';
                        break;
                    }
                    c10 = 65535;
                    break;
                case 1186014765:
                    list = emptyList9;
                    list2 = emptyList10;
                    if (str.equals("cache_hit_urls")) {
                        c10 = 'B';
                        break;
                    }
                    c10 = 65535;
                    break;
                case 1321720943:
                    list = emptyList9;
                    list2 = emptyList10;
                    if (str.equals("allow_pub_owned_ad_view")) {
                        c10 = 31;
                        break;
                    }
                    c10 = 65535;
                    break;
                case 1437255331:
                    list = emptyList9;
                    list2 = emptyList10;
                    if (str.equals("ad_source_id")) {
                        c10 = ':';
                        break;
                    }
                    c10 = 65535;
                    break;
                case 1637553475:
                    list = emptyList9;
                    list2 = emptyList10;
                    if (str.equals("bid_response")) {
                        c10 = '(';
                        break;
                    }
                    c10 = 65535;
                    break;
                case 1638957285:
                    list = emptyList9;
                    list2 = emptyList10;
                    if (str.equals("video_start_urls")) {
                        c10 = 6;
                        break;
                    }
                    c10 = 65535;
                    break;
                case 1686319423:
                    list = emptyList9;
                    list2 = emptyList10;
                    if (str.equals("ad_network_class_name")) {
                        c10 = '7';
                        break;
                    }
                    c10 = 65535;
                    break;
                case 1688341040:
                    list = emptyList9;
                    list2 = emptyList10;
                    if (str.equals("video_reward_urls")) {
                        c10 = 7;
                        break;
                    }
                    c10 = 65535;
                    break;
                case 1799285870:
                    list = emptyList9;
                    list2 = emptyList10;
                    if (str.equals("use_third_party_container_height")) {
                        c10 = '0';
                        break;
                    }
                    c10 = 65535;
                    break;
                case 1839650832:
                    list = emptyList9;
                    list2 = emptyList10;
                    if (str.equals("renderers")) {
                        c10 = 0;
                        break;
                    }
                    c10 = 65535;
                    break;
                case 1875425491:
                    list = emptyList9;
                    list2 = emptyList10;
                    if (str.equals("is_analytics_logging_enabled")) {
                        c10 = '*';
                        break;
                    }
                    c10 = 65535;
                    break;
                case 2068142375:
                    list = emptyList9;
                    list2 = emptyList10;
                    if (str.equals("rule_line_external_id")) {
                        c10 = '4';
                        break;
                    }
                    c10 = 65535;
                    break;
                case 2072888499:
                    list2 = emptyList10;
                    list = emptyList9;
                    if (str.equals("manual_tracking_urls")) {
                        c10 = 15;
                        break;
                    }
                    c10 = 65535;
                    break;
                default:
                    list = emptyList9;
                    list2 = emptyList10;
                    c10 = 65535;
                    break;
            }
            switch (c10) {
                case 0:
                    emptyList = com.google.android.gms.ads.internal.util.zzbu.zzd(jsonReader);
                    zzfudVar = zzfudVar2;
                    emptyList10 = list2;
                    zzfudVar2 = zzfudVar;
                    break;
                case 1:
                    i16 = zzb(jsonReader.nextString());
                    zzfudVar = zzfudVar2;
                    emptyList10 = list2;
                    zzfudVar2 = zzfudVar;
                    break;
                case 2:
                    emptyList2 = com.google.android.gms.ads.internal.util.zzbu.zzd(jsonReader);
                    zzfudVar = zzfudVar2;
                    emptyList10 = list2;
                    zzfudVar2 = zzfudVar;
                    break;
                case 3:
                    emptyList3 = com.google.android.gms.ads.internal.util.zzbu.zzd(jsonReader);
                    zzfudVar = zzfudVar2;
                    emptyList10 = list2;
                    zzfudVar2 = zzfudVar;
                    break;
                case 4:
                    emptyList4 = com.google.android.gms.ads.internal.util.zzbu.zzd(jsonReader);
                    zzfudVar = zzfudVar2;
                    emptyList10 = list2;
                    zzfudVar2 = zzfudVar;
                    break;
                case 5:
                    i17 = zzc(jsonReader.nextInt());
                    zzfudVar = zzfudVar2;
                    emptyList10 = list2;
                    zzfudVar2 = zzfudVar;
                    break;
                case 6:
                    emptyList5 = com.google.android.gms.ads.internal.util.zzbu.zzd(jsonReader);
                    zzfudVar = zzfudVar2;
                    emptyList10 = list2;
                    zzfudVar2 = zzfudVar;
                    break;
                case 7:
                    emptyList6 = com.google.android.gms.ads.internal.util.zzbu.zzd(jsonReader);
                    zzfudVar = zzfudVar2;
                    emptyList10 = list2;
                    zzfudVar2 = zzfudVar;
                    break;
                case '\b':
                    emptyList7 = com.google.android.gms.ads.internal.util.zzbu.zzd(jsonReader);
                    zzfudVar = zzfudVar2;
                    emptyList10 = list2;
                    zzfudVar2 = zzfudVar;
                    break;
                case '\t':
                    str21 = jsonReader.nextString();
                    zzfudVar = zzfudVar2;
                    emptyList10 = list2;
                    zzfudVar2 = zzfudVar;
                    break;
                case '\n':
                    str20 = jsonReader.nextString();
                    zzfudVar = zzfudVar2;
                    emptyList10 = list2;
                    zzfudVar2 = zzfudVar;
                    break;
                case 11:
                    zzbvpVar = zzbvp.zza(com.google.android.gms.ads.internal.util.zzbu.zze(jsonReader));
                    zzfudVar = zzfudVar2;
                    emptyList10 = list2;
                    zzfudVar2 = zzfudVar;
                    break;
                case '\f':
                    emptyList8 = com.google.android.gms.ads.internal.util.zzbu.zzd(jsonReader);
                    zzfudVar = zzfudVar2;
                    emptyList10 = list2;
                    zzfudVar2 = zzfudVar;
                    break;
                case '\r':
                    emptyList9 = com.google.android.gms.ads.internal.util.zzbu.zzd(jsonReader);
                    emptyList10 = list2;
                    continue;
                case 14:
                    emptyList10 = com.google.android.gms.ads.internal.util.zzbu.zzd(jsonReader);
                    zzfudVar2 = zzfudVar2;
                    break;
                case 15:
                    list3 = com.google.android.gms.ads.internal.util.zzbu.zzd(jsonReader);
                    zzfudVar = zzfudVar2;
                    emptyList10 = list2;
                    zzfudVar2 = zzfudVar;
                    break;
                case 16:
                    i10 = jsonReader.nextInt();
                    zzfudVar = zzfudVar2;
                    emptyList10 = list2;
                    zzfudVar2 = zzfudVar;
                    break;
                case 17:
                    list4 = zzfbf.zza(jsonReader);
                    zzfudVar = zzfudVar2;
                    emptyList10 = list2;
                    zzfudVar2 = zzfudVar;
                    break;
                case 18:
                    zzfbkVar = new zzfbk(jsonReader);
                    zzfudVar = zzfudVar2;
                    emptyList10 = list2;
                    zzfudVar2 = zzfudVar;
                    break;
                case 19:
                    list6 = zzfbf.zza(jsonReader);
                    zzfudVar = zzfudVar2;
                    emptyList10 = list2;
                    zzfudVar2 = zzfudVar;
                    break;
                case 20:
                    list5 = com.google.android.gms.ads.internal.util.zzbu.zzd(jsonReader);
                    zzfudVar = zzfudVar2;
                    emptyList10 = list2;
                    zzfudVar2 = zzfudVar;
                    break;
                case 21:
                    str2 = jsonReader.nextString();
                    zzfudVar = zzfudVar2;
                    emptyList10 = list2;
                    zzfudVar2 = zzfudVar;
                    break;
                case 22:
                    jSONObject12 = com.google.android.gms.ads.internal.util.zzbu.zzh(jsonReader);
                    zzfudVar = zzfudVar2;
                    emptyList10 = list2;
                    zzfudVar2 = zzfudVar;
                    break;
                case 23:
                    str3 = jsonReader.nextString();
                    zzfudVar = zzfudVar2;
                    emptyList10 = list2;
                    zzfudVar2 = zzfudVar;
                    break;
                case 24:
                    str4 = jsonReader.nextString();
                    zzfudVar = zzfudVar2;
                    emptyList10 = list2;
                    zzfudVar2 = zzfudVar;
                    break;
                case 25:
                    str5 = com.google.android.gms.ads.internal.util.zzbu.zzh(jsonReader).toString();
                    zzfudVar = zzfudVar2;
                    emptyList10 = list2;
                    zzfudVar2 = zzfudVar;
                    break;
                case 26:
                    zzbwyVar = zzbwy.zza(com.google.android.gms.ads.internal.util.zzbu.zzh(jsonReader));
                    zzfudVar = zzfudVar2;
                    emptyList10 = list2;
                    zzfudVar2 = zzfudVar;
                    break;
                case 27:
                    str6 = jsonReader.nextString();
                    zzfudVar = zzfudVar2;
                    emptyList10 = list2;
                    zzfudVar2 = zzfudVar;
                    break;
                case 28:
                    jSONObject7 = com.google.android.gms.ads.internal.util.zzbu.zzh(jsonReader);
                    zzfudVar = zzfudVar2;
                    emptyList10 = list2;
                    zzfudVar2 = zzfudVar;
                    break;
                case 29:
                    jSONObject8 = com.google.android.gms.ads.internal.util.zzbu.zzh(jsonReader);
                    zzfudVar = zzfudVar2;
                    emptyList10 = list2;
                    zzfudVar2 = zzfudVar;
                    break;
                case 30:
                    z10 = jsonReader.nextBoolean();
                    zzfudVar = zzfudVar2;
                    emptyList10 = list2;
                    zzfudVar2 = zzfudVar;
                    break;
                case 31:
                    z11 = jsonReader.nextBoolean();
                    zzfudVar = zzfudVar2;
                    emptyList10 = list2;
                    zzfudVar2 = zzfudVar;
                    break;
                case ' ':
                    z12 = jsonReader.nextBoolean();
                    zzfudVar = zzfudVar2;
                    emptyList10 = list2;
                    zzfudVar2 = zzfudVar;
                    break;
                case '!':
                    z13 = jsonReader.nextBoolean();
                    zzfudVar = zzfudVar2;
                    emptyList10 = list2;
                    zzfudVar2 = zzfudVar;
                    break;
                case '\"':
                    z14 = jsonReader.nextBoolean();
                    zzfudVar = zzfudVar2;
                    emptyList10 = list2;
                    zzfudVar2 = zzfudVar;
                    break;
                case '#':
                    z15 = jsonReader.nextBoolean();
                    zzfudVar = zzfudVar2;
                    emptyList10 = list2;
                    zzfudVar2 = zzfudVar;
                    break;
                case '$':
                    z16 = jsonReader.nextBoolean();
                    zzfudVar = zzfudVar2;
                    emptyList10 = list2;
                    zzfudVar2 = zzfudVar;
                    break;
                case '%':
                    i11 = zzd(jsonReader.nextString());
                    zzfudVar = zzfudVar2;
                    emptyList10 = list2;
                    zzfudVar2 = zzfudVar;
                    break;
                case '&':
                    i12 = jsonReader.nextInt();
                    zzfudVar = zzfudVar2;
                    emptyList10 = list2;
                    zzfudVar2 = zzfudVar;
                    break;
                case '\'':
                    z17 = jsonReader.nextBoolean();
                    zzfudVar = zzfudVar2;
                    emptyList10 = list2;
                    zzfudVar2 = zzfudVar;
                    break;
                case '(':
                    str7 = jsonReader.nextString();
                    zzfudVar = zzfudVar2;
                    emptyList10 = list2;
                    zzfudVar2 = zzfudVar;
                    break;
                case ')':
                    jSONObject9 = com.google.android.gms.ads.internal.util.zzbu.zzh(jsonReader);
                    zzfudVar = zzfudVar2;
                    emptyList10 = list2;
                    zzfudVar2 = zzfudVar;
                    break;
                case '*':
                    z18 = jsonReader.nextBoolean();
                    zzfudVar = zzfudVar2;
                    emptyList10 = list2;
                    zzfudVar2 = zzfudVar;
                    break;
                case '+':
                    z19 = jsonReader.nextBoolean();
                    zzfudVar = zzfudVar2;
                    emptyList10 = list2;
                    zzfudVar2 = zzfudVar;
                    break;
                case ',':
                    i13 = jsonReader.nextInt();
                    zzfudVar = zzfudVar2;
                    emptyList10 = list2;
                    zzfudVar2 = zzfudVar;
                    break;
                case '-':
                    i14 = jsonReader.nextInt();
                    zzfudVar = zzfudVar2;
                    emptyList10 = list2;
                    zzfudVar2 = zzfudVar;
                    break;
                case '.':
                    str8 = jsonReader.nextString();
                    zzfudVar = zzfudVar2;
                    emptyList10 = list2;
                    zzfudVar2 = zzfudVar;
                    break;
                case '/':
                    str9 = jsonReader.nextString();
                    zzfudVar = zzfudVar2;
                    emptyList10 = list2;
                    zzfudVar2 = zzfudVar;
                    break;
                case '0':
                    z20 = jsonReader.nextBoolean();
                    zzfudVar = zzfudVar2;
                    emptyList10 = list2;
                    zzfudVar2 = zzfudVar;
                    break;
                case '1':
                    zzbsiVar = zzbsi.zza(com.google.android.gms.ads.internal.util.zzbu.zzh(jsonReader));
                    zzfudVar = zzfudVar2;
                    emptyList10 = list2;
                    zzfudVar2 = zzfudVar;
                    break;
                case '2':
                    jsonReader.nextBoolean();
                    zzfudVar = zzfudVar2;
                    emptyList10 = list2;
                    zzfudVar2 = zzfudVar;
                    break;
                case '3':
                    zzsVar = com.google.android.gms.ads.internal.client.zzs.zza(com.google.android.gms.ads.internal.util.zzbu.zzh(jsonReader));
                    zzfudVar = zzfudVar2;
                    emptyList10 = list2;
                    zzfudVar2 = zzfudVar;
                    break;
                case '4':
                    str10 = jsonReader.nextString();
                    zzfudVar = zzfudVar2;
                    emptyList10 = list2;
                    zzfudVar2 = zzfudVar;
                    break;
                case '5':
                    z21 = jsonReader.nextBoolean();
                    zzfudVar = zzfudVar2;
                    emptyList10 = list2;
                    zzfudVar2 = zzfudVar;
                    break;
                case '6':
                    jSONObject10 = com.google.android.gms.ads.internal.util.zzbu.zzh(jsonReader);
                    zzfudVar = zzfudVar2;
                    emptyList10 = list2;
                    zzfudVar2 = zzfudVar;
                    break;
                case '7':
                    str11 = jsonReader.nextString();
                    zzfudVar = zzfudVar2;
                    emptyList10 = list2;
                    zzfudVar2 = zzfudVar;
                    break;
                case '8':
                    str18 = jsonReader.nextString();
                    zzfudVar = zzfudVar2;
                    emptyList10 = list2;
                    zzfudVar2 = zzfudVar;
                    break;
                case '9':
                    if (((Boolean) zzbbr.zzgG.zzl()).booleanValue()) {
                        str12 = jsonReader.nextString();
                        zzfudVar = zzfudVar2;
                        emptyList10 = list2;
                        zzfudVar2 = zzfudVar;
                        break;
                    } else {
                        jsonReader.skipValue();
                        zzfudVar = zzfudVar2;
                        emptyList10 = list2;
                        zzfudVar2 = zzfudVar;
                    }
                case ':':
                    if (((Boolean) zzbbr.zzgG.zzl()).booleanValue()) {
                        str13 = jsonReader.nextString();
                        zzfudVar = zzfudVar2;
                        emptyList10 = list2;
                        zzfudVar2 = zzfudVar;
                        break;
                    } else {
                        jsonReader.skipValue();
                        zzfudVar = zzfudVar2;
                        emptyList10 = list2;
                        zzfudVar2 = zzfudVar;
                    }
                case ';':
                    if (((Boolean) zzbbr.zzgG.zzl()).booleanValue()) {
                        str14 = jsonReader.nextString();
                        zzfudVar = zzfudVar2;
                        emptyList10 = list2;
                        zzfudVar2 = zzfudVar;
                        break;
                    } else {
                        jsonReader.skipValue();
                        zzfudVar = zzfudVar2;
                        emptyList10 = list2;
                        zzfudVar2 = zzfudVar;
                    }
                case '<':
                    if (((Boolean) zzbbr.zzgG.zzl()).booleanValue()) {
                        str15 = jsonReader.nextString();
                        zzfudVar = zzfudVar2;
                        emptyList10 = list2;
                        zzfudVar2 = zzfudVar;
                        break;
                    } else {
                        jsonReader.skipValue();
                        zzfudVar = zzfudVar2;
                        emptyList10 = list2;
                        zzfudVar2 = zzfudVar;
                    }
                case '=':
                    z22 = jsonReader.nextBoolean();
                    zzfudVar = zzfudVar2;
                    emptyList10 = list2;
                    zzfudVar2 = zzfudVar;
                    break;
                case '>':
                    jSONObject11 = com.google.android.gms.ads.internal.util.zzbu.zzh(jsonReader);
                    zzfudVar = zzfudVar2;
                    emptyList10 = list2;
                    zzfudVar2 = zzfudVar;
                    break;
                case '?':
                    z23 = jsonReader.nextBoolean();
                    zzfudVar = zzfudVar2;
                    emptyList10 = list2;
                    zzfudVar2 = zzfudVar;
                    break;
                case '@':
                    str19 = jsonReader.nextString();
                    zzfudVar = zzfudVar2;
                    emptyList10 = list2;
                    zzfudVar2 = zzfudVar;
                    break;
                case 'A':
                    z24 = jsonReader.nextBoolean();
                    zzfudVar = zzfudVar2;
                    emptyList10 = list2;
                    zzfudVar2 = zzfudVar;
                    break;
                case 'B':
                    zzfudVar = com.google.android.gms.ads.internal.util.zzbu.zzd(jsonReader);
                    emptyList10 = list2;
                    zzfudVar2 = zzfudVar;
                    break;
                case 'C':
                    z25 = jsonReader.nextBoolean();
                    zzfudVar = zzfudVar2;
                    emptyList10 = list2;
                    zzfudVar2 = zzfudVar;
                    break;
                case 'D':
                    str16 = jsonReader.nextString();
                    zzfudVar = zzfudVar2;
                    emptyList10 = list2;
                    zzfudVar2 = zzfudVar;
                    break;
                case 'E':
                    str17 = jsonReader.nextString();
                    zzfudVar = zzfudVar2;
                    emptyList10 = list2;
                    zzfudVar2 = zzfudVar;
                    break;
                case 'F':
                    z26 = jsonReader.nextBoolean();
                    zzfudVar = zzfudVar2;
                    emptyList10 = list2;
                    zzfudVar2 = zzfudVar;
                    break;
                case 'G':
                    i15 = jsonReader.nextInt();
                    zzfudVar = zzfudVar2;
                    emptyList10 = list2;
                    zzfudVar2 = zzfudVar;
                    break;
                default:
                    jsonReader.skipValue();
                    zzfudVar = zzfudVar2;
                    emptyList10 = list2;
                    zzfudVar2 = zzfudVar;
                    break;
            }
            emptyList9 = list;
        }
        jsonReader.endObject();
        this.zza = emptyList;
        this.zzb = i16;
        this.zzc = emptyList2;
        this.zzd = emptyList3;
        this.zzg = emptyList4;
        this.zzf = i17;
        this.zzh = emptyList5;
        this.zzi = emptyList6;
        this.zzj = emptyList7;
        this.zzk = str21;
        this.zzl = str20;
        this.zzm = zzbvpVar;
        this.zzn = emptyList8;
        this.zzo = emptyList9;
        this.zzp = emptyList10;
        this.zzq = list3;
        this.zzr = i10;
        this.zzs = list4;
        this.zzt = zzfbkVar;
        this.zzu = list5;
        this.zzv = list6;
        this.zzx = str2;
        this.zzw = jSONObject12;
        this.zzy = str3;
        this.zzz = str4;
        this.zzA = str5;
        this.zzB = zzbwyVar;
        this.zzC = str6;
        this.zzD = jSONObject7;
        this.zzE = jSONObject8;
        this.zzK = z10;
        this.zzL = z11;
        this.zzM = z12;
        this.zzN = z13;
        this.zzO = z14;
        this.zzP = z15;
        this.zzQ = z16;
        this.zzR = i11;
        this.zzS = i12;
        this.zzU = z17;
        this.zzV = str7;
        this.zzW = new zzfcd(jSONObject9);
        this.zzX = z18;
        this.zzY = z19;
        this.zzZ = i13;
        this.zzaa = str8;
        this.zzab = i14;
        this.zzac = str9;
        this.zzad = z20;
        this.zzae = zzbsiVar;
        this.zzaf = zzsVar;
        this.zzag = str10;
        this.zzah = z21;
        this.zzai = jSONObject10;
        this.zzF = str11;
        this.zzG = str12;
        this.zzH = str13;
        this.zzI = str14;
        this.zzJ = str15;
        this.zzaj = z22;
        this.zzak = jSONObject11;
        this.zzal = z23;
        this.zzam = str19;
        this.zzan = z24;
        this.zze = zzfudVar2;
        this.zzT = z25;
        this.zzao = str16;
        this.zzap = str17;
        this.zzaq = str18;
        this.zzar = z26;
        this.zzas = i15;
    }

    public static String zza(int i10) {
        switch (i10) {
            case 1:
                return "BANNER";
            case 2:
                return "INTERSTITIAL";
            case 3:
                return "NATIVE_EXPRESS";
            case 4:
                return "NATIVE";
            case 5:
                return "REWARDED";
            case 6:
                return "APP_OPEN_AD";
            case 7:
                return "REWARDED_INTERSTITIAL";
            default:
                return "UNKNOWN";
        }
    }

    private static int zzb(String str) {
        if ("banner".equals(str)) {
            return 1;
        }
        if ("interstitial".equals(str)) {
            return 2;
        }
        if ("native_express".equals(str)) {
            return 3;
        }
        if ("native".equals(str)) {
            return 4;
        }
        if ("rewarded".equals(str)) {
            return 5;
        }
        if ("app_open_ad".equals(str)) {
            return 6;
        }
        if ("rewarded_interstitial".equals(str)) {
            return 7;
        }
        return 0;
    }

    private static int zzc(int i10) {
        if (i10 != 0 && i10 != 1 && i10 != 3) {
            return 0;
        }
        return i10;
    }

    private static final int zzd(String str) {
        if ("landscape".equalsIgnoreCase(str)) {
            return 6;
        }
        if ("portrait".equalsIgnoreCase(str)) {
            return 7;
        }
        return -1;
    }
}
