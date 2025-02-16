package mysql_;

/**
 * @author czq
 * @version 1.0
 */
public class brand {
    /*
    在实体类中 基本数据类型建议使用包装类型
     */
    private Integer id;
    private String brand_name;

    private String company_name;

    private Integer ordered;

    private String description;

    private Integer status;

//    public brand(Integer id, String brand_name, String company_name, Integer ordered, String description, Integer status) {
//        this.id = id;
//        this.brand_name = brand_name;
//        this.company_name = company_name;
//        this.ordered = ordered;
//        this.description = description;
//        this.status = status;
//    }

    @Override
    public String toString() {
        return "brand{" +
                "id=" + id +
                ", brand_name='" + brand_name + '\'' +
                ", company_name='" + company_name + '\'' +
                ", ordered=" + ordered +
                ", description='" + description + '\'' +
                ", status=" + status +
                '}';
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getBrand_name() {
        return brand_name;
    }

    public void setBrand_name(String brand_name) {
        this.brand_name = brand_name;
    }

    public String getCompany_name() {
        return company_name;
    }

    public void setCompany_name(String company_name) {
        this.company_name = company_name;
    }

    public Integer getOrdered() {
        return ordered;
    }

    public void setOrdered(Integer ordered) {
        this.ordered = ordered;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public Integer getStatus() {
        return status;
    }

    public void setStatus(Integer status) {
        this.status = status;
    }
}
