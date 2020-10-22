package org.si.biodatamhs;
public class BiodataActivity extends KoneksiActivity {
// sourcecode untuk URL ->URL menggunakan IP address default eclipse
	String URL = "http://192.168.10.199/tips_crud_android_json_mysql/server.php";
	String url = "";
	String response = "";
	
	//menampilkan biodata dari database
	public String tampilBiodata() {
		try{
			url = URL + "?operasi=view";
			System.out.println("URL Tampil Biodata : " + url);
			response = call(url);
		}
		catch(Exception e) {
		}
		return response;
	}
	
	//memasukan biodata baru ke dlama database
	public String insertBiodata(String nim,String nama,String alamat) {
		try{
			url = URL + "?operasi=insert&nim=" + nim + "&nama=" + nama + "&alamat=" + alamat;
			System.out.println("URL Insert Biodata : " + url);
			response = call(url);
		}
		catch (Exception e){
		}
			return response;
		}
	
	//melihat biodata berdasarkan ID
	public String getBiodataById (int id) {
		try{
			url=URL + "?operasi=get_biodata_by_id&id=" + id;
			System.out.println("URL Insert Biodata : " + url);
			response = call(url);
		}
		catch(Exception e) {
		}
		return response;
	}
	
	//mengubah isi biodata
	public String updateBiodata(String id, String nim, String nama, String alamat) {
		try{
			url=URL + "?operasi=update&id=" + id + "&nim=" + nim + "&nama=" + nama + "&alamat=" +
					alamat;
			System.out.println("URL Update Biodata : " + url);
			response = call(url);
		}
		catch(Exception e){
		}
		return response;
	}
	
	//coding hapus
	public String deleteBiodata (int id) {
		try{
			url = URL + "?operasi=delete&id=" + id;
			System.out.println("URL Hapus Biodata : " + url);
			response = call(url);
		}
		catch(Exception e){
		}
		return response;
		}
	}