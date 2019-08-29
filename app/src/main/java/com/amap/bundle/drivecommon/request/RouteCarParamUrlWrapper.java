package com.amap.bundle.drivecommon.request;

import com.amap.bundle.network.request.param.builder.AosURLBuilder;
import com.amap.bundle.network.request.param.builder.ParamEntity;
import com.amap.bundle.network.request.param.builder.URLBuilder.Path;

@Path(builder = AosURLBuilder.class, host = "drive_aos_url", sign = {"fromX", "fromY", "toX", "toY"}, url = "ws/mapapi/navigation/auto/?")
public class RouteCarParamUrlWrapper implements ParamEntity {
    public String angle = "-1";
    public String angle_comp;
    public String angle_fittingdir;
    public String angle_gps;
    public String angle_matchingdir;
    public String angle_radius;
    public String angle_sigtype;
    public String angle_type;
    public String carplate = "";
    public String cc = "";
    public int contentoptions;
    public String credibility;
    public String end_floor;
    public String end_name;
    public String end_parentid;
    public String end_parentrel;
    public String end_poi_angle;
    public String end_poi_extension = "0";
    public String end_poiid;
    public String end_typecode;
    public String end_types;
    public String fitting_cre;
    public String fromX;
    public String fromY;
    public String frompage;
    public String gps_cre;
    public String history_points;
    public String invoker;
    public int off = 0;
    public String output = "bin";
    public String playstyle = "0";
    public String policy2;
    public int refresh = 0;
    public String route_mode;
    public String route_version = "2.5.3";
    public String sdk_version;
    public String sigshelter;
    public String sloc_precision;
    public double sloc_speed;
    public String soundtype = "9";
    public String start_poiid;
    public String start_typecode;
    public String start_types;
    public String superid;
    public int threeD = 1;
    public String toX;
    public String toY;
    public int use_truck_engine;
    public String usepoiquery = "true";
    public String v_axis = "0";
    public float v_height = 0.0f;
    public float v_length = 0.0f;
    public float v_load = 0.0f;
    public String v_size = "0";
    public int v_type = 0;
    public float v_weight = 0.0f;
    public float v_width = 0.0f;
    public String via_names;
    public String via_typecodes;
    public String viapoint_poiids;
    public String viapoint_types;
    public String viapoints;

    public RouteCarParamUrlWrapper(RouteCarParamUrlWrapper routeCarParamUrlWrapper) {
        this.off = routeCarParamUrlWrapper.off;
        this.fromX = routeCarParamUrlWrapper.fromX;
        this.fromY = routeCarParamUrlWrapper.fromY;
        this.toX = routeCarParamUrlWrapper.toX;
        this.toY = routeCarParamUrlWrapper.toY;
        this.policy2 = routeCarParamUrlWrapper.policy2;
        this.start_poiid = routeCarParamUrlWrapper.start_poiid;
        this.start_types = routeCarParamUrlWrapper.start_types;
        this.end_poiid = routeCarParamUrlWrapper.end_poiid;
        this.end_types = routeCarParamUrlWrapper.end_types;
        this.viapoints = routeCarParamUrlWrapper.viapoints;
        this.viapoint_types = routeCarParamUrlWrapper.viapoint_types;
        this.via_typecodes = routeCarParamUrlWrapper.via_typecodes;
        this.viapoint_poiids = routeCarParamUrlWrapper.viapoint_poiids;
        this.carplate = routeCarParamUrlWrapper.carplate;
        this.usepoiquery = routeCarParamUrlWrapper.usepoiquery;
        this.output = routeCarParamUrlWrapper.output;
        this.sdk_version = routeCarParamUrlWrapper.sdk_version;
        this.angle = routeCarParamUrlWrapper.angle;
        this.credibility = routeCarParamUrlWrapper.credibility;
        this.invoker = routeCarParamUrlWrapper.invoker;
        this.start_typecode = routeCarParamUrlWrapper.start_typecode;
        this.end_typecode = routeCarParamUrlWrapper.end_typecode;
        this.contentoptions = routeCarParamUrlWrapper.contentoptions;
        this.sloc_precision = routeCarParamUrlWrapper.sloc_precision;
        this.sloc_speed = routeCarParamUrlWrapper.sloc_speed;
        this.route_version = routeCarParamUrlWrapper.route_version;
        this.sigshelter = routeCarParamUrlWrapper.sigshelter;
        this.threeD = routeCarParamUrlWrapper.threeD;
        this.v_type = routeCarParamUrlWrapper.v_type;
        this.v_height = routeCarParamUrlWrapper.v_height;
        this.v_load = routeCarParamUrlWrapper.v_load;
        this.v_weight = routeCarParamUrlWrapper.v_weight;
        this.v_width = routeCarParamUrlWrapper.v_width;
        this.v_length = routeCarParamUrlWrapper.v_length;
        this.v_size = routeCarParamUrlWrapper.v_size;
        this.v_axis = routeCarParamUrlWrapper.v_axis;
        this.cc = routeCarParamUrlWrapper.cc;
        this.refresh = routeCarParamUrlWrapper.refresh;
        this.playstyle = routeCarParamUrlWrapper.playstyle;
        this.soundtype = routeCarParamUrlWrapper.soundtype;
        this.end_name = routeCarParamUrlWrapper.end_name;
        this.superid = routeCarParamUrlWrapper.superid;
        this.angle_type = routeCarParamUrlWrapper.angle_type;
        this.angle_gps = routeCarParamUrlWrapper.angle_gps;
        this.angle_comp = routeCarParamUrlWrapper.angle_comp;
        this.end_parentid = routeCarParamUrlWrapper.end_parentid;
        this.end_parentrel = routeCarParamUrlWrapper.end_parentrel;
        this.end_floor = routeCarParamUrlWrapper.end_floor;
        this.end_poi_angle = routeCarParamUrlWrapper.end_poi_angle;
        this.frompage = routeCarParamUrlWrapper.frompage;
        this.via_names = routeCarParamUrlWrapper.via_names;
        this.angle_fittingdir = routeCarParamUrlWrapper.angle_fittingdir;
        this.angle_matchingdir = routeCarParamUrlWrapper.angle_matchingdir;
        this.angle_radius = routeCarParamUrlWrapper.angle_matchingdir;
        this.angle_sigtype = routeCarParamUrlWrapper.angle_radius;
        this.gps_cre = routeCarParamUrlWrapper.gps_cre;
        this.fitting_cre = routeCarParamUrlWrapper.fitting_cre;
        this.end_poi_extension = routeCarParamUrlWrapper.end_poi_extension;
        this.route_mode = routeCarParamUrlWrapper.route_mode;
    }

    public RouteCarParamUrlWrapper() {
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("RouteCarParamUrlWrapper{off=");
        sb.append(this.off);
        sb.append(", fromX='");
        sb.append(this.fromX);
        sb.append('\'');
        sb.append(", fromY='");
        sb.append(this.fromY);
        sb.append('\'');
        sb.append(", toX='");
        sb.append(this.toX);
        sb.append('\'');
        sb.append(", toY='");
        sb.append(this.toY);
        sb.append('\'');
        sb.append(", policy2='");
        sb.append(this.policy2);
        sb.append('\'');
        sb.append(", start_poiid='");
        sb.append(this.start_poiid);
        sb.append('\'');
        sb.append(", start_types='");
        sb.append(this.start_types);
        sb.append('\'');
        sb.append(", end_poiid='");
        sb.append(this.end_poiid);
        sb.append('\'');
        sb.append(", end_types='");
        sb.append(this.end_types);
        sb.append('\'');
        sb.append(", viapoints='");
        sb.append(this.viapoints);
        sb.append('\'');
        sb.append(", viapoint_types='");
        sb.append(this.viapoint_types);
        sb.append('\'');
        sb.append(", via_typecodes='");
        sb.append(this.via_typecodes);
        sb.append('\'');
        sb.append(", viapoint_poiids='");
        sb.append(this.viapoint_poiids);
        sb.append('\'');
        sb.append(", carplate='");
        sb.append(this.carplate);
        sb.append('\'');
        sb.append(", use_truck_engine=");
        sb.append(this.use_truck_engine);
        sb.append(", cc=");
        sb.append(this.cc);
        sb.append(", usepoiquery='");
        sb.append(this.usepoiquery);
        sb.append('\'');
        sb.append(", output='");
        sb.append(this.output);
        sb.append('\'');
        sb.append(", sdk_version='");
        sb.append(this.sdk_version);
        sb.append('\'');
        sb.append(", angle='");
        sb.append(this.angle);
        sb.append('\'');
        sb.append(", credibility='");
        sb.append(this.credibility);
        sb.append('\'');
        sb.append(", invoker='");
        sb.append(this.invoker);
        sb.append('\'');
        sb.append(", start_typecode='");
        sb.append(this.start_typecode);
        sb.append('\'');
        sb.append(", end_typecode='");
        sb.append(this.end_typecode);
        sb.append('\'');
        sb.append(", contentoptions=");
        sb.append(this.contentoptions);
        sb.append(", sloc_precision='");
        sb.append(this.sloc_precision);
        sb.append('\'');
        sb.append(", sloc_speed=");
        sb.append(this.sloc_speed);
        sb.append(", route_version='");
        sb.append(this.route_version);
        sb.append('\'');
        sb.append(", sigshelter='");
        sb.append(this.sigshelter);
        sb.append('\'');
        sb.append(", threeD=");
        sb.append(this.threeD);
        sb.append(", v_type=");
        sb.append(this.v_type);
        sb.append(", v_height=");
        sb.append(this.v_height);
        sb.append(", v_load=");
        sb.append(this.v_load);
        sb.append(", v_weight=");
        sb.append(this.v_weight);
        sb.append(", v_width=");
        sb.append(this.v_width);
        sb.append(", v_length=");
        sb.append(this.v_length);
        sb.append(", v_size='");
        sb.append(this.v_size);
        sb.append('\'');
        sb.append(", v_axis='");
        sb.append(this.v_axis);
        sb.append('\'');
        sb.append(", refresh=");
        sb.append(this.refresh);
        sb.append(", playstyle='");
        sb.append(this.playstyle);
        sb.append('\'');
        sb.append(", soundtype='");
        sb.append(this.soundtype);
        sb.append('\'');
        sb.append(", end_name='");
        sb.append(this.end_name);
        sb.append('\'');
        sb.append(", superid='");
        sb.append(this.superid);
        sb.append('\'');
        sb.append(", angle_type='");
        sb.append(this.angle_type);
        sb.append('\'');
        sb.append(", angle_gps='");
        sb.append(this.angle_gps);
        sb.append('\'');
        sb.append(", angle_comp='");
        sb.append(this.angle_comp);
        sb.append('\'');
        sb.append(", end_parentid='");
        sb.append(this.end_parentid);
        sb.append('\'');
        sb.append(", end_parentrel='");
        sb.append(this.end_parentrel);
        sb.append('\'');
        sb.append(", end_floor='");
        sb.append(this.end_floor);
        sb.append('\'');
        sb.append(", end_poi_angle='");
        sb.append(this.end_poi_angle);
        sb.append('\'');
        sb.append(", frompage='");
        sb.append(this.frompage);
        sb.append('\'');
        sb.append(", via_names='");
        sb.append(this.via_names);
        sb.append('\'');
        sb.append(", angle_fittingdir='");
        sb.append(this.angle_fittingdir);
        sb.append('\'');
        sb.append(", angle_matchingdir='");
        sb.append(this.angle_matchingdir);
        sb.append('\'');
        sb.append(", angle_radius='");
        sb.append(this.angle_radius);
        sb.append('\'');
        sb.append(", angle_sigtype='");
        sb.append(this.angle_sigtype);
        sb.append('\'');
        sb.append(", gps_cre='");
        sb.append(this.gps_cre);
        sb.append('\'');
        sb.append(", fitting_cre='");
        sb.append(this.fitting_cre);
        sb.append('\'');
        sb.append(", history_points='");
        sb.append(this.history_points);
        sb.append('\'');
        sb.append(", end_poi_extension='");
        sb.append(this.end_poi_extension);
        sb.append('\'');
        sb.append(", route_mode='");
        sb.append(this.route_mode);
        sb.append('\'');
        sb.append('}');
        return sb.toString();
    }
}